<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Exam 2</title>
    <style>
        h1{
            font-family: "Times New Roman";

        }
        h2{
            font-family: Arial;
        }
        table {
            font-family: Bahnschrift , sans-serif;
            border-collapse: collapse;
            width: 100%;
        }

        td {
            border: 1px solid #0A0A2A;
            text-align: left;
            padding: 8px;

        }
        th {
            border: 3px solid #190714;
            text-align: center;
            padding: 8px;

        }

        tr:nth-child(even) {
            background-color: #F8E0EC;
        }
    </style>
</head>
<body style="background:#FBF8EF">
<h1 align="center">Duy Research Lab</h1>
<h2 align="center">Deadliest Virus List</h2>

<table>
    <tr>

        <th>Name</th>
        <th>Description</th>
        <th>Symptoms</th>
        <th>Duration before cure(in days)</th>
        <th>Mortality (percentage)</th>
        <th>Image</th>
    </tr>
    <c:forEach var = "listvirus" items = "${viruslist}">
        <tr>

            <td>${listvirus.name}</td>
            <td>${listvirus.description}</td>
            <td>${listvirus.symptoms}</td>
            <td>${listvirus.duration}</td>
            <td>${listvirus.mortality}</td>
            <td><img src=${listvirus.image} style="width:300px;height:300px;"></td>

        </tr>
    </c:forEach>
</table>
</body>
</html>

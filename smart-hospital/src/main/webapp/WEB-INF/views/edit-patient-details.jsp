<html lang="en">
<head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
</head>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<div class="d-flex justify-content-center">
    <form method="put" action="/patient/update">
        <input type="hidden" name="id" value="${patient.id}" />

        <div class="form-group">
            <label for="exampleFormControlInput1">Patient Name</label>
            <input type="text" class="form-control" name="name" value="${patient.name}">
          </div>

        <div class="form-group">
            <label for="exampleFormControlInput1">Enter Patient email address</label>
            <input type="email" name="email" class="form-control" placeholder="name@example.com" value="${patient.email}">
        </div>

        <button type="submit" class="btn btn-primary">Update</button>
    </form>

</div>


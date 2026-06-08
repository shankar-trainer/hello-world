<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">

<form name='login' action="/login" method='POST' class="container w-50 mt-4 p-5 border border-primary bg-success text-light">
     ${error}

    <div class="row mb-3 align-items-center">
        <div class="col-4">
            <label for="username" class="col-form-label">Username:</label>
        </div>
        <div class="col-8">
            <input class="form-control" type='text' id='username' name='username' value=''>
        </div>
    </div>

    <div class="row mb-3 align-items-center">
        <div class="col-4">
            <label for="password" class="col-form-label">Password:</label>
        </div>
        <div class="col-8">
            <input class="form-control" type='password' id='password' name='password'>
        </div>
    </div>

    <div class="row mb-3">
        <div class="offset-3">
            <input class="btn btn-primary col-4" name="submit" type="submit" value="Submit" />

            <input class="btn btn-primary col-4" name="reset" type="reset" value="Cancel" />
            <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
        </div>
    </div>
</form>
async function signup() {
    let username = document.getElementById("username").value;
    let password = document.getElementById("password").value;

    console.log(username, password);
    console.log(require);

    var express = require('express');
    var cors = require('cors');
    var app = express();

    app.use(cors()); // habilitando o cors da aplicação para todas as rotas

    app.listen(8080, () => {
        console.log('CORS-enabled web server listening on port 8080');
    });


    const header = new Headers({
        "Content-Type": "application/json; charset=utf8",
        "Accept": "application/json",
        "Access-Control-Allow-Origin": '*',
        "Access-Control-Allow-Methods": "POST,PATCH,GET,OPTIONS"
    });


    const response = await fetch("http://localhost:8080/user", {
        method: "POST",
        headers: header,
        body: JSON.stringify({
            username: username,
            password: password
        })
    });

    if (response.ok) {
        showToast("#okToast");
    } else {
        showToast("#errorToast");
    }
}

function showToast(id) {
    var toastElList = [].slice.call(document.querySelectorAll(id));
    var toastList = toastElList.map(function (toastEl) {
        return new bootstrap.Toast(toastEl);
    });
    toastList.forEach((toast) => toast.show());
}


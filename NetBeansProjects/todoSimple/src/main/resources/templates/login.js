async function login() {
  let username = document.getElementById("username").value;
  let password = document.getElementById("password").value;

  console.log(username, password);
  
  const header = new Headers({
      "Content-Type": "application/json; charset=utf8",
      "Accept": "application/json",
      "Access-Control-Allow-Origin":"*",
      "Access-Control-Allow-Methods":"POST,PATCH,GET,OPTIONS"
    });
    
  
  const response = await fetch("https://localhost8080/login", {
    method: "POST",
    headers: header,
    body: JSON.stringify({
      username: username,
      password: password
    })
  });
  console.log("DEU RUIM MEU NOBRE");
  let key = "Authorization";
  let token = response.headers.get(key);
  window.localStorage.setItem(key, token);

  if (response.ok) {
    showToast("#okToast");
  } else {
    showToast("#errorToast");
    
  }

  window.setTimeout(function () {
    window.location = "/templates/index.html";
  }, 2000);
}

function showToast(id) {
  var toastElList = [].slice.call(document.querySelectorAll(id));
  var toastList = toastElList.map(function (toastEl) {
    return new bootstrap.Toast(toastEl);
  });
  toastList.forEach((toast) => toast.show());
}


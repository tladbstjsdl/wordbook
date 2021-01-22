window.addEventListener("DOMContentLoaded", function() {
	const form = document.querySelector("form");
	form.onsubmit = function () {
		let formData = new FormData(form);
		const xhr = new XMLHttpRequest();
		xhr.onreadystatechange = function () {
			if(xhr.readyState === XMLHttpRequest.DONE) {
				if(xhr.status === 200) {
					if(xhr.responseText === "loginSuccess") {
						location.href = "/";
						alert("로그인 성공");
					}
					else if(xhr.responseText === "memberIdError") {
						alert("아이디 오류");
					}
					else {
						alert("비밀번호 오류");
					}
				}
				else {
					alert(xhr.statusText);
				}
			}
			else {
				console.log("ㅇㅅㅇ2");
				return false;
			}
		}
		xhr.open('POST', '/loginConfirm', true);
		xhr.send(formData);
		return false;
	}
});
function insertMember() {
	let form = document.querySelector("#loginForm");
	form.action = "/insertForm"
	form.submit();
}
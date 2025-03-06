document.addEventListener("DOMContentLoaded", () => {


	const form = document.getElementById("cadastroEnderecoForm");


	form.addEventListener("submit", async (event) => {
		event.preventDefault();


		const rua = document.getElementById("Rua").value;
		const cep = document.getElementById("Cep").value;	
        const bairro = document.getElementById("Bairro").value;
		const estado = document.getElementById("Estado").value;
		const cidade = document.getElementById("Cidade").value;
        const complemento = document.getElementById("Complemento").value;


		try {


			const response = await fetch("http://localhost:8080/enderecos", {
				method: "POST",
				headers: {  
					"Content-Type": "application/json"
				},
				body: JSON.stringify({
					rua,
					cep,
					bairro,
					estado,
					cidade,
                    complemento
				}),
			});


			if (response.ok) {
				alert("Endereco cadastrado com sucesso!");
				
				
			} else {
				alert("Erro ao cadastrar o Endereco");
			}
		} catch (error) {
			console.error("Erro ao cadastrar o Endereco:", error);
		}


	});
}); 
 
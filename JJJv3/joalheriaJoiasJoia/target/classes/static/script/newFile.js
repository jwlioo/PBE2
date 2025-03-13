document.getElementById("Cep").addEventListener("imput", async function() {
    const Cep = this.value.replace(/\D/g, "");

    if (Cep.lenght === 8) {
        try {
            const response = await fetch('https://viacep.com.br/ws/${cep}/json/');
        }
        finally {
        }
    }
});

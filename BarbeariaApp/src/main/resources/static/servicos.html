<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Gerenciar Serviços</title>
    <link href="css/estilo.css" rel="stylesheet"> <!-- Opcional -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="js/config.js"></script> <!-- Importando config.js -->
    <script src="https://cdn.jsdelivr.net/npm/axios/dist/axios.min.js"></script>
</head>
<body>
    <div class="container mt-5">
        <h1 class="text-center">Gerenciar Serviços</h1>
        <form id="servicoForm" class="mb-4">
            <div class="mb-3">
                <label for="nomeserv" class="form-label">Nome do Serviço</label>
                <input type="text" id="nomeserv" class="form-control" required>
            </div>
            <div class="mb-3">
                <label for="descserv" class="form-label">Descrição</label>
                <input type="text" id="descserv" class="form-control">
            </div>
            <div class="mb-3">
                <label for="precoserv" class="form-label">Preço</label>
                <input type="number" step="0.01" id="precoserv" class="form-control" required>
            </div>
            <button type="submit" class="btn btn-primary">Salvar</button>
        </form>
        <table class="table table-bordered">
            <thead>
                <tr>
                    <th>ID</th>
                    <th>Nome</th>
                    <th>Descrição</th>
                    <th>Preço</th>
                    <th>Ações</th>
                </tr>
            </thead>
            <tbody id="servicosTable"></tbody>
        </table>
    </div>
    <script>
        const apiUrl = `${API_BASE_URL}/servicos`;

        const loadServicos = async () => {
            try {
                const response = await axios.get(apiUrl);
                const servicos = response.data;
                const tableBody = document.getElementById('servicosTable');
                tableBody.innerHTML = "";
                servicos.forEach(servico => {
                    tableBody.innerHTML += `
                        <tr>
                            <td>${servico.codserv}</td>
                            <td>${servico.nomeserv}</td>
                            <td>${servico.descserv || ""}</td>
                            <td>R$ ${servico.precoserv.toFixed(2)}</td>
                            <td>
                                <button class="btn btn-warning btn-sm" onclick="editServico(${servico.codserv})">Editar</button>
                                <button class="btn btn-danger btn-sm" onclick="deleteServico(${servico.codserv})">Excluir</button>
                            </td>
                        </tr>
                    `;
                });
            } catch (error) {
                console.error(error);
            }
        };

        document.getElementById('servicoForm').addEventListener('submit', async (event) => {
            event.preventDefault();
            const servico = {
                nomeserv: document.getElementById('nomeserv').value,
                descserv: document.getElementById('descserv').value,
                precoserv: parseFloat(document.getElementById('precoserv').value)
            };
            await axios.post(apiUrl, servico);
            loadServicos();
        });

        const deleteServico = async (id) => {
            await axios.delete(`${apiUrl}/${id}`);
            loadServicos();
        };

        loadServicos();
    </script>
</body>
</html>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Gerenciar Fornecedores</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/axios/dist/axios.min.js"></script>
    <script src="js/config.js"></script> <!-- Configuração da URL base -->
</head>
<body>
    <div class="container mt-5">
        <h1 class="text-center">Gerenciar Fornecedores</h1>
        <form id="fornecedorForm" class="mb-4">
            <div class="mb-3">
                <label for="nomeforn" class="form-label">Nome</label>
                <input type="text" id="nomeforn" class="form-control" required>
            </div>
            <div class="mb-3">
                <label for="telforn" class="form-label">Telefone</label>
                <input type="text" id="telforn" class="form-control" required>
            </div>
            <div class="mb-3">
                <label for="emailforn" class="form-label">Email</label>
                <input type="email" id="emailforn" class="form-control" required>
            </div>
            <div class="mb-3">
                <label for="enderecoforn" class="form-label">Endereço</label>
                <input type="text" id="enderecoforn" class="form-control" required>
            </div>
            <button type="submit" class="btn btn-primary">Salvar</button>
        </form>
        <div id="message" class="alert d-none" role="alert"></div>
        <table class="table table-bordered">
            <thead>
                <tr>
                    <th>ID</th>
                    <th>Nome</th>
                    <th>Telefone</th>
                    <th>Email</th>
                    <th>Endereço</th>
                    <th>Ações</th>
                </tr>
            </thead>
            <tbody id="fornecedoresTable"></tbody>
        </table>
    </div>
    <script>
        const apiUrl = `${API_BASE_URL}/fornecedores`;

        const loadFornecedores = async () => {
            try {
                const response = await axios.get(apiUrl);
                const fornecedores = response.data;
                const tableBody = document.getElementById('fornecedoresTable');
                tableBody.innerHTML = "";
                fornecedores.forEach(fornecedor => {
                    tableBody.innerHTML += `
                        <tr>
                            <td>${fornecedor.codforn}</td>
                            <td>${fornecedor.nomeforn}</td>
                            <td>${fornecedor.telforn}</td>
                            <td>${fornecedor.emailforn}</td>
                            <td>${fornecedor.enderecoforn}</td>
                            <td>
                                <button class="btn btn-warning btn-sm" onclick="editFornecedor(${fornecedor.codforn})">Editar</button>
                                <button class="btn btn-danger btn-sm" onclick="deleteFornecedor(${fornecedor.codforn})">Excluir</button>
                            </td>
                        </tr>
                    `;
                });
            } catch (error) {
                showMessage('Erro ao carregar fornecedores.', 'danger');
                console.error(error);
            }
        };

        document.getElementById('fornecedorForm').addEventListener('submit', async (event) => {
            event.preventDefault();
            const fornecedor = {
                nomeforn: document.getElementById('nomeforn').value,
                telforn: document.getElementById('telforn').value,
                emailforn: document.getElementById('emailforn').value,
                enderecoforn: document.getElementById('enderecoforn').value
            };
            try {
                await axios.post(apiUrl, fornecedor);
                showMessage('Fornecedor salvo com sucesso.', 'success');
                document.getElementById('fornecedorForm').reset();
                loadFornecedores();
            } catch (error) {
                showMessage('Erro ao salvar fornecedor.', 'danger');
                console.error(error);
            }
        });

        const deleteFornecedor = async (id) => {
            if (confirm('Tem certeza que deseja excluir este fornecedor?')) {
                try {
                    await axios.delete(`${apiUrl}/${id}`);
                    showMessage('Fornecedor excluído com sucesso.', 'success');
                    loadFornecedores();
                } catch (error) {
                    showMessage('Erro ao excluir fornecedor.', 'danger');
                    console.error(error);
                }
            }
        };

        const showMessage = (message, type) => {
            const messageDiv = document.getElementById('message');
            messageDiv.textContent = message;
            messageDiv.className = `alert alert-${type}`;
            messageDiv.classList.remove('d-none');
            setTimeout(() => {
                messageDiv.classList.add('d-none');
            }, 3000);
        };

        loadFornecedores();
    </script>
</body>
</html>

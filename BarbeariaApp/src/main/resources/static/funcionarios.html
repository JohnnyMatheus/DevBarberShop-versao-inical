<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Gerenciar Funcionários</title>
    <link href="css/estilo.css" rel="stylesheet"> <!-- Opcional -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="js/config.js"></script> <!-- Configuração da URL base -->
    <script src="https://cdn.jsdelivr.net/npm/axios/dist/axios.min.js"></script>
</head>
<body>
    <div class="container mt-5">
        <h1 class="text-center">Gerenciar Funcionários</h1>
        <!-- Formulário para Adicionar Funcionário -->
        <form id="funcionarioForm" class="mb-4">
            <div class="mb-3">
                <label for="nomefun" class="form-label">Nome</label>
                <input type="text" id="nomefun" class="form-control" required>
            </div>
            <div class="mb-3">
                <label for="telefone" class="form-label">Telefone</label>
                <input type="text" id="telefone" class="form-control" required>
            </div>
            <div class="mb-3">
                <label for="email" class="form-label">Email</label>
                <input type="email" id="email" class="form-control" required>
            </div>
            <div class="mb-3">
                <label for="cargo" class="form-label">Cargo</label>
                <input type="text" id="cargo" class="form-control" required>
            </div>
            <button type="submit" class="btn btn-primary">Salvar</button>
        </form>
        <!-- Tabela para Listar Funcionários -->
        <table class="table table-bordered">
            <thead>
                <tr>
                    <th>ID</th>
                    <th>Nome</th>
                    <th>Telefone</th>
                    <th>Email</th>
                    <th>Cargo</th>
                    <th>Ações</th>
                </tr>
            </thead>
            <tbody id="funcionariosTable"></tbody>
        </table>
    </div>
    <script>
        const apiUrl = `${API_BASE_URL}/funcionarios`;

        // Função para Carregar Funcionários
        const loadFuncionarios = async () => {
            try {
                const response = await axios.get(apiUrl);
                const funcionarios = response.data;
                const tableBody = document.getElementById('funcionariosTable');
                tableBody.innerHTML = "";

                funcionarios.forEach(funcionario => {
                    tableBody.innerHTML += `
                        <tr>
                            <td>${funcionario.codfun}</td>
                            <td>${funcionario.nomefun}</td>
                            <td>${funcionario.telefone}</td>
                            <td>${funcionario.email}</td>
                            <td>${funcionario.cargo}</td>
                            <td>
                                <button class="btn btn-warning btn-sm" onclick="editFuncionario(${funcionario.codfun})">Editar</button>
                                <button class="btn btn-danger btn-sm" onclick="deleteFuncionario(${funcionario.codfun})">Excluir</button>
                            </td>
                        </tr>
                    `;
                });
            } catch (error) {
                console.error("Erro ao carregar funcionários:", error);
            }
        };

        // Função para Adicionar ou Editar Funcionário
        document.getElementById('funcionarioForm').addEventListener('submit', async (event) => {
            event.preventDefault();
            const funcionario = {
                nomefun: document.getElementById('nomefun').value,
                telefone: document.getElementById('telefone').value,
                email: document.getElementById('email').value,
                cargo: document.getElementById('cargo').value
            };

            try {
                await axios.post(apiUrl, funcionario);
                document.getElementById('funcionarioForm').reset();
                loadFuncionarios();
            } catch (error) {
                console.error("Erro ao salvar funcionário:", error);
            }
        });

        // Função para Deletar Funcionário
        const deleteFuncionario = async (id) => {
            try {
                await axios.delete(`${apiUrl}/${id}`);
                loadFuncionarios();
            } catch (error) {
                console.error("Erro ao excluir funcionário:", error);
            }
        };

        // Carregar os Funcionários na Inicialização
        loadFuncionarios();
    </script>
</body>
</html>

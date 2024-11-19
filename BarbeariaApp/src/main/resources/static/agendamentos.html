<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Gerenciar Agendamentos</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" href="css/style.css">
    <script src="https://cdn.jsdelivr.net/npm/axios/dist/axios.min.js"></script>
    <script src="js/config.js"></script>
</head>
<body>
    <div class="container mt-5">
        <h1 class="text-center">Gerenciar Agendamentos</h1>

        <!-- Formulário para Agendamentos -->
        <form id="agendamento-form" class="row g-3 mb-4">
            <input type="hidden" id="agendamento-id">

            <div class="col-md-6">
                <label for="data_hora" class="form-label">Data e Hora</label>
                <input type="datetime-local" id="data_hora" class="form-control" required>
            </div>
            <div class="col-md-6">
                <label for="status" class="form-label">Status</label>
                <select id="status" class="form-control" required>
                    <option value="">Selecione</option>
                    <option value="Pendente">Pendente</option>
                    <option value="Concluído">Concluído</option>
                    <option value="Cancelado">Cancelado</option>
                </select>
            </div>
            <div class="col-md-6">
                <label for="cliente" class="form-label">Cliente</label>
                <select id="cliente" class="form-control" required></select>
            </div>
            <div class="col-md-6">
                <label for="funcionario" class="form-label">Funcionário</label>
                <select id="funcionario" class="form-control" required></select>
            </div>

            <div class="col-12">
                <button type="submit" class="btn btn-primary">Salvar</button>
                <button type="reset" class="btn btn-secondary">Limpar</button>
            </div>
        </form>

        <!-- Lista de Agendamentos -->
        <h3 class="mt-5">Lista de Agendamentos</h3>
        <div class="table-responsive">
            <table class="table table-striped table-bordered">
                <thead class="table-dark">
                    <tr>
                        <th>ID</th>
                        <th>Data e Hora</th>
                        <th>Status</th>
                        <th>Cliente</th>
                        <th>Funcionário</th>
                        <th>Ações</th>
                    </tr>
                </thead>
                <tbody id="agendamentos-table"></tbody>
            </table>
        </div>
    </div>

    <script>
        const API_URL = `${API_BASE_URL}/agendamentos`;

        const form = document.getElementById('agendamento-form');
        const tableBody = document.getElementById('agendamentos-table');
        const agendamentoId = document.getElementById('agendamento-id');

        // Função para carregar clientes
        async function carregarClientes() {
            try {
                const response = await axios.get(`${API_BASE_URL}/clientes`);
                const clienteSelect = document.getElementById('cliente');
                clienteSelect.innerHTML = '<option value="">Selecione</option>';
                response.data.forEach(cliente => {
                    clienteSelect.innerHTML += `<option value="${cliente.codcli}">${cliente.nomcli}</option>`;
                });
            } catch (error) {
                console.error('Erro ao carregar clientes:', error);
            }
        }

        // Função para carregar funcionários
        async function carregarFuncionarios() {
            try {
                const response = await axios.get(`${API_BASE_URL}/funcionarios`);
                const funcionarioSelect = document.getElementById('funcionario');
                funcionarioSelect.innerHTML = '<option value="">Selecione</option>';
                response.data.forEach(funcionario => {
                    funcionarioSelect.innerHTML += `<option value="${funcionario.codfun}">${funcionario.nomefun}</option>`;
                });
            } catch (error) {
                console.error('Erro ao carregar funcionários:', error);
            }
        }

        // Função para carregar agendamentos
        async function carregarAgendamentos() {
            try {
                const response = await axios.get(API_URL);
                tableBody.innerHTML = '';
                response.data.forEach(agendamento => {
                    const row = `<tr>
                        <td>${agendamento.codagen}</td>
                        <td>${new Date(agendamento.data_hora).toLocaleString()}</td>
                        <td>${agendamento.status}</td>
                        <td>${agendamento.cliente.nomcli}</td>
                        <td>${agendamento.funcionario.nomefun}</td>
                        <td>
                            <button class="btn btn-warning btn-sm" onclick="editarAgendamento(${agendamento.codagen})">Editar</button>
                            <button class="btn btn-danger btn-sm" onclick="deletarAgendamento(${agendamento.codagen})">Deletar</button>
                        </td>
                    </tr>`;
                    tableBody.innerHTML += row;
                });
            } catch (error) {
                console.error('Erro ao carregar agendamentos:', error);
            }
        }

        // Função para salvar ou atualizar agendamento
        form.addEventListener('submit', async (event) => {
            event.preventDefault();

            const agendamento = {
                data_hora: document.getElementById('data_hora').value,
                status: document.getElementById('status').value,
                cliente: { codcli: document.getElementById('cliente').value },
                funcionario: { codfun: document.getElementById('funcionario').value },
            };

            const id = agendamentoId.value;
            const url = id ? `${API_URL}/${id}` : API_URL;
            const method = id ? 'PUT' : 'POST';

            try {
                await axios({
                    method: method,
                    url: url,
                    headers: { 'Content-Type': 'application/json' },
                    data: agendamento,
                });
                carregarAgendamentos();
                form.reset();
                agendamentoId.value = '';
            } catch (error) {
                console.error('Erro ao salvar agendamento:', error);
            }
        });

        // Função para editar agendamento
        async function editarAgendamento(id) {
            try {
                const response = await axios.get(`${API_URL}/${id}`);
                const agendamento = response.data;
                agendamentoId.value = agendamento.codagen;
                document.getElementById('data_hora').value = agendamento.data_hora.slice(0, 16);
                document.getElementById('status').value = agendamento.status;
                document.getElementById('cliente').value = agendamento.cliente.codcli;
                document.getElementById('funcionario').value = agendamento.funcionario.codfun;
            } catch (error) {
                console.error('Erro ao carregar agendamento para edição:', error);
            }
        }

        // Função para deletar agendamento
        async function deletarAgendamento(id) {
            if (confirm('Tem certeza que deseja deletar este agendamento?')) {
                try {
                    await axios.delete(`${API_URL}/${id}`);
                    carregarAgendamentos();
                } catch (error) {
                    console.error('Erro ao deletar agendamento:', error);
                }
            }
        }

        // Inicializar a página
        carregarClientes();
        carregarFuncionarios();
        carregarAgendamentos();
    </script>
</body>
</html>

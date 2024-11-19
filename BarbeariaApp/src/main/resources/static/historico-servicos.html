<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Histórico de Serviços</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" href="css/style.css">
    <script src="js/config.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/axios/dist/axios.min.js"></script>
   
</head>
<body>
    <div class="container mt-5">
        <h1 class="text-center">Histórico de Serviços</h1>

        <!-- Formulário para Adicionar Histórico -->
        <form id="historico-servico-form" class="row g-3 mb-4">
            <div class="col-md-6">
                <label for="data_hora" class="form-label">Data e Hora</label>
                <input type="datetime-local" id="data_hora" class="form-control" required>
            </div>
            <div class="col-md-6">
                <label for="servico" class="form-label">Serviço</label>
                <select id="servico" class="form-control" required></select>
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
                <button type="submit" class="btn btn-primary">Salvar Histórico</button>
            </div>
        </form>

        <!-- Lista de Histórico de Serviços -->
        <h3 class="mt-5">Lista de Serviços Realizados</h3>
        <div class="table-responsive">
            <table class="table table-striped table-bordered">
                <thead class="table-dark">
                    <tr>
                        <th>ID</th>
                        <th>Data e Hora</th>
                        <th>Serviço</th>
                        <th>Cliente</th>
                        <th>Funcionário</th>
                        <th>Ações</th>
                    </tr>
                </thead>
                <tbody id="historico-servicos-table"></tbody>
            </table>
        </div>
    </div>

    <script>
        const API_URL = `${API_BASE_URL}/historico-servicos`;

        const tableBody = document.getElementById('historico-servicos-table');
        const form = document.getElementById('historico-servico-form');

        // Função para carregar histórico de serviços
        async function carregarHistoricoServicos() {
            try {
                const response = await axios.get(API_URL);
                tableBody.innerHTML = '';
                response.data.forEach(historico => {
                    const dataHora = historico.dataHora
                        ? new Date(historico.dataHora).toLocaleString('pt-BR', {
                              day: '2-digit',
                              month: '2-digit',
                              year: 'numeric',
                              hour: '2-digit',
                              minute: '2-digit',
                          })
                        : 'Data Inválida';

                    const row = `<tr>
                        <td>${historico.codhistorico}</td>
                        <td>${dataHora}</td>
                        <td>${historico.servico.nomeserv}</td>
                        <td>${historico.cliente.nomcli}</td>
                        <td>${historico.funcionario.nomefun}</td>
                        <td>
                            <button class="btn btn-warning btn-sm" onclick="visualizarHistorico(${historico.codhistorico})">Visualizar</button>
                        </td>
                    </tr>`;
                    tableBody.innerHTML += row;
                });
            } catch (error) {
                console.error('Erro ao carregar histórico de serviços:', error);
            }
        }

        // Função para visualizar detalhes do histórico de serviço
        async function visualizarHistorico(id) {
            try {
                const response = await axios.get(`${API_URL}/${id}`);
                const historico = response.data;
                const dataHora = new Date(historico.dataHora).toLocaleString('pt-BR', {
                    day: '2-digit',
                    month: '2-digit',
                    year: 'numeric',
                    hour: '2-digit',
                    minute: '2-digit',
                });

                alert(`Detalhes do Histórico:
                ID: ${historico.codhistorico}
                Data e Hora: ${dataHora}
                Serviço: ${historico.servico.nomeserv}
                Cliente: ${historico.cliente.nomcli}
                Funcionário: ${historico.funcionario.nomefun}`);
            } catch (error) {
                console.error('Erro ao visualizar histórico de serviço:', error);
            }
        }

        // Função para carregar dados para os selects
        async function carregarSelects() {
            try {
                const [servicos, clientes, funcionarios] = await Promise.all([
                    axios.get(`${API_BASE_URL}/servicos`),
                    axios.get(`${API_BASE_URL}/clientes`),
                    axios.get(`${API_BASE_URL}/funcionarios`),
                ]);

                const servicoSelect = document.getElementById('servico');
                const clienteSelect = document.getElementById('cliente');
                const funcionarioSelect = document.getElementById('funcionario');

                servicoSelect.innerHTML = '<option value="">Selecione</option>';
                clienteSelect.innerHTML = '<option value="">Selecione</option>';
                funcionarioSelect.innerHTML = '<option value="">Selecione</option>';

                servicos.data.forEach(servico => {
                    servicoSelect.innerHTML += `<option value="${servico.codserv}">${servico.nomeserv}</option>`;
                });

                clientes.data.forEach(cliente => {
                    clienteSelect.innerHTML += `<option value="${cliente.codcli}">${cliente.nomcli}</option>`;
                });

                funcionarios.data.forEach(funcionario => {
                    funcionarioSelect.innerHTML += `<option value="${funcionario.codfun}">${funcionario.nomefun}</option>`;
                });
            } catch (error) {
                console.error('Erro ao carregar dados para os selects:', error);
            }
        }

        // Função para salvar histórico de serviço
   form.addEventListener('submit', async (event) => {
    event.preventDefault();

    const dataHora = document.getElementById('data_hora').value;
    const servico = document.getElementById('servico').value;
    const cliente = document.getElementById('cliente').value;
    const funcionario = document.getElementById('funcionario').value;

    if (!dataHora || !servico || !cliente || !funcionario) {
        alert('Preencha todos os campos obrigatórios!');
        return;
    }

    const historicoServico = {
        dataHora: new Date(dataHora).toISOString(),
        servico: { codserv: parseInt(servico, 10) },
        cliente: { codcli: parseInt(cliente, 10) },
        funcionario: { codfun: parseInt(funcionario, 10) },
    };

    try {
        const response = await axios.post(API_URL, historicoServico, {
            headers: { 'Content-Type': 'application/json' },
        });

        if (response.status === 200) {
            alert('Histórico salvo com sucesso!');
            carregarHistoricoServicos();
            form.reset();
        } else {
            throw new Error('Erro ao salvar histórico.');
        }
    } catch (error) {
        console.error('Erro ao salvar histórico de serviço:', error);
        alert('Erro ao salvar histórico. Verifique os dados.');
    }
});


        // Inicializar página
        carregarSelects();
        carregarHistoricoServicos();
    </script>
</body>
</html>

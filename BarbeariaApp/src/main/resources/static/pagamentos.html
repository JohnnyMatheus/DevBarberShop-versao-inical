<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Gerenciar Pagamentos</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" href="css/style.css">
    <script src="https://cdn.jsdelivr.net/npm/axios/dist/axios.min.js"></script>
    <script src="js/config.js"></script>
</head>
<body>
    <div class="container mt-5">
        <h1 class="text-center">Gerenciar Pagamentos</h1>

        <!-- Formulário para Pagamentos -->
        <form id="pagamento-form" class="row g-3 mb-4">
            <input type="hidden" id="pagamento-id">

            <div class="col-md-6">
                <label for="valor" class="form-label">Valor</label>
                <input type="number" step="0.01" id="valor" class="form-control" required>
            </div>
            <div class="col-md-6">
                <label for="data_hora_pagamento" class="form-label">Data e Hora do Pagamento</label>
                <input type="datetime-local" id="data_hora_pagamento" class="form-control" required>
            </div>
            <div class="col-md-6">
                <label for="forma_pagamento" class="form-label">Forma de Pagamento</label>
                <select id="forma_pagamento" class="form-control" required>
                    <option value="">Selecione</option>
                    <option value="Dinheiro">Dinheiro</option>
                    <option value="Cartão de Crédito">Cartão de Crédito</option>
                    <option value="Cartão de Débito">Cartão de Débito</option>
                    <option value="Pix">Pix</option>
                </select>
            </div>
            <div class="col-md-6">
                <label for="cliente" class="form-label">Cliente</label>
                <select id="cliente" class="form-control" required></select>
            </div>
            <div class="col-md-6">
                <label for="agendamento" class="form-label">Agendamento</label>
                <select id="agendamento" class="form-control" required></select>
            </div>

            <div class="col-12">
                <button type="submit" class="btn btn-primary">Salvar</button>
                <button type="reset" class="btn btn-secondary">Limpar</button>
            </div>
        </form>

        <!-- Lista de Pagamentos -->
        <h3 class="mt-5">Lista de Pagamentos</h3>
        <div class="table-responsive">
            <table class="table table-striped table-bordered">
                <thead class="table-dark">
                    <tr>
                        <th>ID</th>
                        <th>Valor</th>
                        <th>Data e Hora</th>
                        <th>Forma de Pagamento</th>
                        <th>Cliente</th>
                        <th>Agendamento</th>
                        <th>Ações</th>
                    </tr>
                </thead>
                <tbody id="pagamentos-table"></tbody>
            </table>
        </div>
    </div>

    <script>
        const API_URL = `${API_BASE_URL}/pagamentos`;

        const form = document.getElementById('pagamento-form');
        const tableBody = document.getElementById('pagamentos-table');
        const pagamentoId = document.getElementById('pagamento-id');

        // Carregar clientes
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

        // Carregar agendamentos
        async function carregarAgendamentos() {
            try {
                const response = await axios.get(`${API_BASE_URL}/agendamentos`);
                const agendamentoSelect = document.getElementById('agendamento');
                agendamentoSelect.innerHTML = '<option value="">Selecione</option>';
                response.data.forEach(agendamento => {
                    agendamentoSelect.innerHTML += `<option value="${agendamento.codagen}">Agendamento ${agendamento.codagen}</option>`;
                });
            } catch (error) {
                console.error('Erro ao carregar agendamentos:', error);
            }
        }

        async function carregarPagamentos() {
            try {
                const response = await axios.get(API_URL);
                tableBody.innerHTML = '';
                response.data.forEach(pagamento => {
                    // Ajuste de data para exibição correta
                    const dataHora = new Date(pagamento.data_hora_pagamento).toLocaleString();

                    const row = `<tr>
                        <td>${pagamento.codpag}</td>
                        <td>R$ ${pagamento.valor.toFixed(2)}</td>
                        <td>${dataHora}</td>
                        <td>${pagamento.forma_pagamento}</td>
                        <td>${pagamento.cliente.nomcli}</td>
                        <td>Agendamento ${pagamento.agendamento.codagen}</td>
                        <td>
                            <button class="btn btn-warning btn-sm" onclick="editarPagamento(${pagamento.codpag})">Editar</button>
                            <button class="btn btn-danger btn-sm" onclick="deletarPagamento(${pagamento.codpag})">Deletar</button>
                        </td>
                    </tr>`;
                    tableBody.innerHTML += row;
                });
            } catch (error) {
                console.error('Erro ao carregar pagamentos:', error);
            }
        }


        // Salvar ou atualizar pagamento
        form.addEventListener('submit', async (event) => {
            event.preventDefault();

            const pagamento = {
                valor: parseFloat(document.getElementById('valor').value),
                data_hora_pagamento: document.getElementById('data_hora_pagamento').value,
                forma_pagamento: document.getElementById('forma_pagamento').value,
                cliente: { codcli: document.getElementById('cliente').value },
                agendamento: { codagen: document.getElementById('agendamento').value },
            };

            const id = pagamentoId.value;
            const url = id ? `${API_URL}/${id}` : API_URL;
            const method = id ? 'PUT' : 'POST';

            try {
                await axios({
                    method: method,
                    url: url,
                    headers: { 'Content-Type': 'application/json' },
                    data: pagamento,
                });
                carregarPagamentos();
                form.reset();
                pagamentoId.value = '';
            } catch (error) {
                console.error('Erro ao salvar pagamento:', error);
            }
        });

        // Editar pagamento
        async function editarPagamento(id) {
            try {
                const response = await axios.get(`${API_URL}/${id}`);
                const pagamento = response.data;
                pagamentoId.value = pagamento.codpag;
                document.getElementById('valor').value = pagamento.valor;
                document.getElementById('data_hora_pagamento').value = pagamento.data_hora_pagamento.slice(0, 16);
                document.getElementById('forma_pagamento').value = pagamento.forma_pagamento;
                document.getElementById('cliente').value = pagamento.cliente.codcli;
                document.getElementById('agendamento').value = pagamento.agendamento.codagen;
            } catch (error) {
                console.error('Erro ao carregar pagamento para edição:', error);
            }
        }

        // Deletar pagamento
        async function deletarPagamento(id) {
            if (confirm('Tem certeza que deseja deletar este pagamento?')) {
                try {
                    await axios.delete(`${API_URL}/${id}`);
                    carregarPagamentos();
                } catch (error) {
                    console.error('Erro ao deletar pagamento:', error);
                }
            }
        }

        // Inicializar página
        carregarClientes();
        carregarAgendamentos();
        carregarPagamentos();
    </script>
</body>
</html>

<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <title>Cadastro de Clientes</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" href="css/style.css">
</head>
<body>
    <!-- Menu Lateral (Sidebar) -->
    <div id="sidebar"></div>
    <script>
        fetch("sidebar.html")
            .then(response => response.text())
            .then(data => {
                document.getElementById("sidebar").innerHTML = data;
            });
    </script>

    <!-- Conteúdo da Página -->
    <div class="container-fluid content">
        <h2 class="mt-4">Cadastro de Clientes</h2>
        <form id="cliente-form" class="row g-3 mb-4">
            <input type="hidden" id="cliente-id">

            <!-- Campos do Formulário -->
            <div class="col-md-6">
                <label for="nome" class="form-label">Nome</label>
                <input type="text" id="nome" class="form-control" required>
            </div>
            <div class="col-md-6">
                <label for="telefone" class="form-label">Telefone</label>
                <input type="text" id="telefone" class="form-control" required>
            </div>
            <div class="col-md-6">
                <label for="email" class="form-label">Email</label>
                <input type="email" id="email" class="form-control" required>
            </div>
            <div class="col-md-6">
                <label for="dtnasc" class="form-label">Data de Nascimento</label>
                <input type="date" id="dtnasc" class="form-control" required>
            </div>
            <div class="col-md-6">
                <label for="sexo" class="form-label">Sexo</label>
                <select id="sexo" class="form-control" required>
                    <option value="">Selecione</option>
                    <option value="Masculino">Masculino</option>
                    <option value="Feminino">Feminino</option>
                    <option value="Outro">Outro</option>
                </select>
            </div>
            <div class="col-md-6">
                <label for="bairro" class="form-label">Bairro</label>
                <input type="text" id="bairro" class="form-control" required>
            </div>
            <div class="col-md-6">
                <label for="cidade" class="form-label">Cidade</label>
                <input type="text" id="cidade" class="form-control" required>
            </div>
            <div class="col-md-6">
                <label for="rua" class="form-label">Rua</label>
                <input type="text" id="rua" class="form-control" required>
            </div>

            <!-- Botões -->
            <div class="col-12">
                <button type="submit" class="btn btn-primary">Salvar</button>
                <button type="reset" class="btn btn-secondary">Limpar</button>
            </div>
        </form>

        <h3 class="mt-5">Lista de Clientes</h3>
        <div class="table-responsive">
            <table class="table table-striped table-bordered">
                <thead class="table-dark">
                    <tr>
                        <th>ID</th>
                        <th>Nome</th>
                        <th>Telefone</th>
                        <th>Email</th>
                        <th>Data de Nascimento</th>
                        <th>Sexo</th>
                        <th>Bairro</th>
                        <th>Cidade</th>
                        <th>Rua</th>
                        <th>Ações</th>
                    </tr>
                </thead>
                <tbody id="clientes-table"></tbody>
            </table>
        </div>
    </div>

    <script>
        const form = document.getElementById('cliente-form');
        const tableBody = document.getElementById('clientes-table');
        const clienteId = document.getElementById('cliente-id');

        // Função para carregar clientes
        function carregarClientes() {
            fetch('/clientes')
                .then(response => response.json())
                .then(data => {
                    tableBody.innerHTML = '';
                    data.forEach(cliente => {
                        const row = `<tr>
                            <td>${cliente.codcli}</td>
                            <td>${cliente.nomcli}</td>
                            <td>${cliente.telcli}</td>
                            <td>${cliente.emailcli}</td>
                            <td>${cliente.dtnascli}</td>
                            <td>${cliente.sexocli}</td>
                            <td>${cliente.bairrocli}</td>
                            <td>${cliente.cidadecli}</td>
                            <td>${cliente.ruaendcli}</td>
                            <td>
                                <button class="btn btn-warning btn-sm" onclick="editarCliente(${cliente.codcli})">Editar</button>
                                <button class="btn btn-danger btn-sm" onclick="deletarCliente(${cliente.codcli})">Deletar</button>
                            </td>
                        </tr>`;
                        tableBody.innerHTML += row;
                    });
                });
        }

        form.addEventListener('submit', (event) => {
            event.preventDefault();

            const cliente = {
                nomcli: document.getElementById('nome').value,
                telcli: document.getElementById('telefone').value,
                emailcli: document.getElementById('email').value,
                dtnascli: document.getElementById('dtnasc').value,
                sexocli: document.getElementById('sexo').value,
                bairrocli: document.getElementById('bairro').value,
                cidadecli: document.getElementById('cidade').value,
                ruaendcli: document.getElementById('rua').value
            };

            const id = clienteId.value;
            const url = id ? `/clientes/${id}` : '/clientes';
            const method = id ? 'PUT' : 'POST';

            fetch(url, {
                method: method,
                headers: { 'Content-Type': 'application/json' },
                body: JSON.stringify(cliente)
            })
            .then(response => {
                if (response.ok) {
                    carregarClientes();
                    form.reset();
                    clienteId.value = '';
                }
            });
        });

        function editarCliente(id) {
            fetch(`/clientes/${id}`)
                .then(response => response.json())
                .then(cliente => {
                    clienteId.value = cliente.codcli;
                    document.getElementById('nome').value = cliente.nomcli;
                    document.getElementById('telefone').value = cliente.telcli;
                    document.getElementById('email').value = cliente.emailcli;
                    document.getElementById('dtnasc').value = cliente.dtnascli;
                    document.getElementById('sexo').value = cliente.sexocli;
                    document.getElementById('bairro').value = cliente.bairrocli;
                    document.getElementById('cidade').value = cliente.cidadecli;
                    document.getElementById('rua').value = cliente.ruaendcli;
                });
        }

        function deletarCliente(id) {
            if (confirm('Tem certeza que deseja deletar este cliente?')) {
                fetch(`/clientes/${id}`, { method: 'DELETE' })
                    .then(() => carregarClientes());
            }
        }

        carregarClientes();
    </script>
</body>
</html>

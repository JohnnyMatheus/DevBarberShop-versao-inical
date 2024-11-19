<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Gerenciar Produtos</title>
    <link href="css/estilo.css" rel="stylesheet"> <!-- Opcional -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="js/config.js"></script> <!-- Importando config.js -->
    <script src="https://cdn.jsdelivr.net/npm/axios/dist/axios.min.js"></script>
</head>
<body>
    <div class="container mt-5">
        <h1 class="text-center">Gerenciar Produtos</h1>
        <form id="produtoForm" class="mb-4">
            <div class="mb-3">
                <label for="nomeprod" class="form-label">Nome do Produto</label>
                <input type="text" id="nomeprod" class="form-control" required>
            </div>
            <div class="mb-3">
                <label for="descprod" class="form-label">Descrição</label>
                <input type="text" id="descprod" class="form-control">
            </div>
            <div class="mb-3">
                <label for="precoprod" class="form-label">Preço</label>
                <input type="number" step="0.01" id="precoprod" class="form-control" required>
            </div>
            <div class="mb-3">
                <label for="qtdprod" class="form-label">Quantidade em Estoque</label>
                <input type="number" id="qtdprod" class="form-control" required>
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
                    <th>Quantidade em Estoque</th>
                    <th>Ações</th>
                </tr>
            </thead>
            <tbody id="produtosTable"></tbody>
        </table>
    </div>
    <script>
        const apiUrl = `${API_BASE_URL}/produtos`;

        const loadProdutos = async () => {
            try {
                const response = await axios.get(apiUrl);
                const produtos = response.data;
                const tableBody = document.getElementById('produtosTable');
                tableBody.innerHTML = "";
                produtos.forEach(produto => {
                    tableBody.innerHTML += `
                        <tr>
                            <td>${produto.codprod}</td>
                            <td>${produto.nomeprod}</td>
                            <td>${produto.descprod || ""}</td>
                            <td>R$ ${produto.precoprod.toFixed(2)}</td>
                            <td>${produto.qtdprod}</td>
                            <td>
                                <button class="btn btn-warning btn-sm" onclick="editProduto(${produto.codprod})">Editar</button>
                                <button class="btn btn-danger btn-sm" onclick="deleteProduto(${produto.codprod})">Excluir</button>
                            </td>
                        </tr>
                    `;
                });
            } catch (error) {
                console.error(error);
            }
        };

        document.getElementById('produtoForm').addEventListener('submit', async (event) => {
            event.preventDefault();
            const produto = {
                nomeprod: document.getElementById('nomeprod').value,
                descprod: document.getElementById('descprod').value,
                precoprod: parseFloat(document.getElementById('precoprod').value),
                qtdprod: parseInt(document.getElementById('qtdprod').value, 10)
            };
            await axios.post(apiUrl, produto);
            loadProdutos();
        });

        const deleteProduto = async (id) => {
            await axios.delete(`${apiUrl}/${id}`);
            loadProdutos();
        };

        loadProdutos();
    </script>
</body>
</html>

<p>
    O Strategy é um padrão de projeto comportamental que permite
    que seja definida uma familia de algoritmos, coloque-os em classes separadas
    e faça os objetos de cada um intercambiáveis
</p>

<p>
    O padrão Strategy sugere que você pegue uma classe que faz algo específico em diversas maneiras diferentes e extraia todos esses algoritmos para classes separadas chamadas estratégias.
</p>

<p>
    A classe original, chamada contexto, deve ter um campo para armazenar uma referência para um dessas estratégias. O contexto delega o trabalho para um objeto estratégia ao invés de executá-lo por conta própria.
</p>

<p>
    O contexto não é responsável por selecionar um algoritmo apropriado para o trabalho. Ao invés disso, o cliente passa a estratégia desejada para o contexto. Na verdade, o contexto não sabe muito sobre as estratégias. Ele trabalha com todas elas através de uma interface genérica, que somente expõe um único método para acionar o algoritmo encapsulado dentro da estratégia selecionada.
</p>

<h2> Quando utilizar </h2>
<ul>
    <li>
        Utilize o padrão Strategy quando você quer usar diferentes variantes de um algoritmo dentro de um   objeto e ser capaz de trocar de um algoritmo para outro durante a execução.
    </li>
    <li>
        Utilize o Strategy quando você tem muitas classes parecidas que somente diferem na forma que elas executam algum comportamento.
    </li>
    <li>
        Utilize o padrão para isolar a lógica do negócio de uma classe dos detalhes de implementação de algoritmos que podem não ser tão importantes no contexto da lógica.
    </li>
    <li>
        Utilize o padrão quando sua classe tem um operador condicional muito grande que troca entre     diferentes variantes do mesmo algoritmo.
    </li>
</ul>

<h2> Como implementar </h2>
<ol>
    <li>
        Na classe contexto, identifique um algoritmo que é sujeito a frequentes mudanças. Pode ser também uma condicional enorme que seleciona e executa uma variante do mesmo algoritmo durante a execução do programa.
    </li>
    <li>
        Declare a interface da estratégia comum para todas as variantes do algoritmo.
    </li>
    <li>
        Um por um, extraia todos os algoritmos para suas próprias classes. Elas devem todas implementar a interface estratégia.
    </li>
    <li>
        Na classe contexto, adicione um campo para armazenar uma referência a um objeto estratégia. Forneça um setter para substituir valores daquele campo. O contexto deve trabalhar com o objeto estratégia somente através da interface estratégia. O contexto pode definir uma interface que deixa a estratégia acessar seus dados.
    </li>
    <li>
        Os Clientes do contexto devem associá-lo com uma estratégia apropriada que coincide com a maneira que esperam que o contexto atue em seu trabalho primário.
    </li>
</ol>

<h3> Exemplo desenvolvido </h3>
<p>
    Aqui foi desenvolvido o comportamento de um Robo, onde o mesmo tem várias maneiras de 
    se movimentar. (Agressivo, normal, defensivo) De acordo com a situação desejada.
</p>
<p>
    Interface da estratégia (Comportamento.java), classes de estratégia (ComportamentoAgressivo.java,
    ComportamentoNormal.java e ComportamentoDefensivo.java), classe de contexo (Robo.java)
</p>


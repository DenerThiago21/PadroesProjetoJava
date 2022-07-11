<h1> Facade </h1>
<p>
    O Facade é um padrão de projeto estrutural que fornece uma interface simplificada para uma biblioteca, um framework, ou qualquer conjunto complexo de classes.
</p>
<p>
    Uma fachada é uma classe que fornece uma interface simples para um subsistema complexo que contém muitas partes que se movem. 
</p>
<p>
    Ter uma fachada é útil quando você precisa integrar sua aplicação com uma biblioteca sofisticada que tem dúzias de funcionalidades, mas você precisa de apenas um pouquinho delas.
</p>

<h2> Quando Utilizar </h2>
<ul>
    <li>
        Utilize o padrão Facade quando você precisa ter uma interface limitada mas simples para um subsistema complexo.
    </li>
    <li>
        Utilize o Facade quando você quer estruturar um subsistema em camadas.
    </li>
</ul>

<h2> Como implementar </h2>
<ol>
    <li>
        Verifique se é possível providenciar uma interface mais simples que a que o subsistema já fornece. Você está no caminho certo se essa interface faz o código cliente independente de muitas classes do subsistema.
    </li>
    <li>
        Declare e implemente essa interface em uma nova classe fachada. A fachada deve redirecionar as chamadas do código cliente para os objetos apropriados do subsistema. A fachada deve ser responsável por inicializar o subsistema e gerenciar seu ciclo de vida a menos que o código cliente já faça isso.
    </li>
    <li>
        Para obter o benefício pleno do padrão, faça todo o código cliente se comunicar com o subsistema apenas através da fachada. Agora o código cliente fica protegido de qualquer mudança no código do subsistema. Por exemplo, quando um subsistema recebe um upgrade para uma nova versão, você só precisa modificar o código na fachada.
    </li>
    <li>
        Se a fachada ficar grande demais, considere extrair parte de seu comportamento para uma nova e refinada classe fachada.
    </li>
</ol>

<h3> Exemplo desenvolvido </h3>
<p>
    Aqui foi desenvolvido um exemplo em que temos dois subsistemas (packages crm e cep), que simulam
    um serviço e uma api que será utilizado pela classe Facede, a qual será a fachada, ou seja
    a interface simplificada para o consumo do cliente.
</p>
<p>
    Analogia a uma API REST
</p>

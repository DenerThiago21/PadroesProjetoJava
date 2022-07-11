<h1> Singleton </h1>
<p>
    O Singleton é um padrão de projeto criacional que permite a você garantir que uma classe tenha apenas uma instância, enquanto provê um ponto de acesso global para essa instância.
</p>
<p>
    Todas as implementações do Singleton tem esses dois passos em comum:
</p>
<p>
    <ul>
        <li>
            Fazer o construtor padrão privado, para prevenir que outros objetos usem o operador new com a classe singleton.
        </li>
        <li>
            Criar um método estático de criação que age como um construtor. Esse método chama o construtor privado por debaixo dos panos para criar um objeto e o salva em um campo estático. Todas as chamadas seguintes para esse método retornam o objeto em cache.
        </li>
    </ul>
</p>
<p>
    Se o seu código tem acesso à classe singleton, então ele será capaz de chamar o método estático da singleton. Então sempre que aquele método é chamado, o mesmo objeto é retornado.
</p>

<h2> Quando Utilizar </h2>
<ul>
    <li>
        Utilize o padrão Singleton quando uma classe em seu programa deve ter apenas uma instância disponível para todos seus clientes; por exemplo, um objeto de base de dados único compartilhado por diferentes partes do programa.
    </li>
    <li>
        Utilize o padrão Singleton quando você precisa de um controle mais estrito sobre as variáveis globais.
    </li>
</ul>

<h2> Como implementar </h2>
<ol>
    <li>
        Adicione um campo privado estático na classe para o armazenamento da instância singleton.
    </li>
    <li>
        Declare um método de criação público estático para obter a instância singleton.
    </li>
    <li>
        Implemente a “inicialização preguiçosa” dentro do método estático. Ela deve criar um novo objeto na sua primeira chamada e colocá-lo no campo estático. O método deve sempre retornar aquela instância em todas as chamadas subsequentes.
    </li>
    <li>
        Faça o construtor da classe ser privado. O método estático da classe vai ainda ser capaz de chamar o construtor, mas não os demais objetos.
    </li>
    <li>
        Vá para o código cliente e substitua todas as chamadas diretas para o construtor do singleton com chamadas para seu método de criação estático.
    </li>
</ol>

<h3> Exemplo desenvolvido </h3>
<p>
    Aqui foi desenvolvido diferentes tipos de singleton: 
    <ol>
        <li>
            No Singleton apressado (SingletoEager.java) o objeto é instanciado
            de cara logo no inicio.
        </li>
        <li>
            No Singleton preguiçoso (SingletonLazy.java) o objeto é instanciado 
            dentro do método getInstancia();
        </li>
        <li>
            No Singleton preguisoço, porém "mais otimizado" (SingletonLazyHolder.java)
            o objeto é instanciando dentro de uma classe privada e estatica e chamado
            dentro do método getInstancia();
        </li>
    </ol>
</p>

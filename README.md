<div align="center">
    <img src="https://github.com/Julianamcs/rh/blob/main/src/br/com/alura/rh/img/Solid2.png" width="600px"></h1>
</div>

<hr>
<B>:open_book:PRINCÍPIOS SOLID</B>

    • Os princípios SOLID são cinco princípios do design de classes orientado a objetos. Eles são um conjunto de regras e práticas 
      recomendadas a serem seguidas na criação de uma estrutura de classe. Então cada um desses princípios formam o SOLID que são 
      princípios focados em boas práticas de programação e de orientação a objetos.
 <br/>
 <hr>
<B>:bookmark_tabs:S - Single Responsibility Principle (Princípio da responsabilidade única):</B>
      
    🎯• Uma classe deve ter um, e somente um, motivo para mudar. Esse princípio declara que uma classe deve ser especializada em um único
      assunto e possuir apenas uma responsabilidade dentro do software, como a classe deve ter uma única tarefa ou ação para executar. <br/>
       
    🚨 Violação do Single Responsibility Principle pode gerar alguns problemas:
      - Falta de coesão: uma classe não deve assumir responsabilidades que não são suas;
      - Alto acoplamento: Mais responsabilidades geram maior nível de dependências deixando o sistema engessado e frágil para alterações;
      - Dificuldades na implementação de testes automatizados: É difícil de “mockar” esse tipo de classe;
      - Dificuldades para reaproveitar o código.
   <hr>
<B>:bookmark_tabs:O - Open-Closed Principle (Princípio aberto/fechado):</B>

    🎯• Classes, objetos ou entidades devem estar abertos para extensão, mas fechados para modificação. Modificação significa alterar o
      código de uma classes, objetos ou entidades existente, enquanto extensão significa, adicionar novas funcionalidades, quando 
      novos comportamentos e recursos precisam ser adicionados no software, devemos estender e não alterar o código fonte original. 
      O princípio de aberto/fechado diz que as classes devem estar abertas para extensão, mas fechadas para modificação. 

    🎯• Open-Closed Principle também é base para o padrão de projeto Strategy particularmente esse é o princípio que a sua principal 
      vantagem é a facilidade na adição de novos requisitos, diminuindo as chances de introduzir novos bugs.
 <hr>
<B>:bookmark_tabs:L - Liskov Substitution Principle (Princípio da substituição de Liskov):</B>
      
    🎯 • Princípio da substituição de Liskov, onde uma classe derivada deve ser substituível por sua classe base. Isso quer dizer que, se 
      a classe B for uma subclasse da classe A, devemos poder passar um objeto da classe B para qualquer método que espere um objeto da
      classe A e o método não deverá produzir resultados estranhos, nesse caso.

    🎯 • Esse é o comportamento esperado, pois, quando usamos a herança, levamos em conta que a classe filha herda tudo o que a superclasse
      tem. A classe filha estende o comportamento, mas nunca o reduz.
       
    🚨 Violação do Liskov Substitution Principl (LSP):
      - Sobrescrever/implementar um método que não faz nada;
      - Lançar uma exceção inesperada;
      - Retornar valores de tipos diferentes da classe base.
 <hr>
<B>:bookmark_tabs:I - Interface Segregation Principle (Princípio da segregação da interface):</B> 
   
    🎯• Esse princípio basicamente diz que é melhor criar interfaces mais específicas ao invés de termos uma única interface genérica, 
        ou seja, segregação. Segregação quer dizer manter as coisas separadas. O princípio da segregação da interface tem a ver com 
        separar as interfaces. O princípio declara que muitas interfaces específicas do cliente são melhores que uma interface de 
        propósito geral.

    🚨 Violação do Liskov Substitution Principl (LSP):
      - Uma classe não deve ser forçada a implementar interfaces e métodos que não irão utilizar.
 <hr>
<B>:bookmark_tabs:D - O Dependency Inversion Principle (Princípio da inversão da dependência): </B>
 
      🎯• Dependa de abstrações e não de implementações, a declaração que nossas classes devem depender de interfaces ou classes abstratas
      em vez de classes concretas e de funções. Queremos que nossas classes estejam abertas para extensão, por isso reorganizamos nossas 
      dependências para que dependam de interfaces em vez de classes concretas. Nossa classe GerenteDePersistencia depende de 
      PersistenciaDaFatura em vez de classes que implementam aquela interface.
      
          1. Módulos de alto nível não devem depender de módulos de baixo nível. Ambos devem depender da abstração.
          2. Abstrações não devem depender de detalhes. Detalhes devem depender de abstrações.
 <hr>
<div>
<B>:footprints: O que estamos abordando aqui no SOLID com Java: princípios da programação orientada a objetos:</B>
   
     • Aprenda conceitos avançados de orientação a objetos;<br/>
     • Escreva código coeso com Single Responsibility Principle;<br/>
     • Saiba como lidar com acoplamento;<br/>
     • Entenda a fundo os ganhos do encapsulamento;<br/>
     • Domine os princípios de código sólido;<br/>
     • Veja técnicas e exemplos em Java;<br/>
     • Tudo isso em um sistema de RH.
</div>    
<B>:computer:Sistema RH</B>

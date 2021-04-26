O código de teste não deve se mistura com o código comum, cria uma classe no folder de teste, com o mesmo nome da classe a ser testada.
Deixe tudo INLINE PARA O CÓDIGO FICAR CLEAN DO CLEAN
_____________________________________________________________________________________________________________________________
Tipos de Assertions 
-assertTrue quando você espera que retorne true
-assertFalse = Qando esper que retorne false
-asseltEquals = Quando espera que seja igual
-assertArrayEquals = Usado para comparar valores de Arrays ou listas
______________________________________________________________________________________________________________________________
- AssertEquals sempre é essa estrutura: PRIMEIRO O VALOR ESPERADO, DEPOIS O VALOR QUE RECEBER PARA TESTAR
- Todo método de Teste tem que ser PUBLIC e VOID
- Use padrões para definiri as condições nos nomes do método, ex: nomeDoMétodo_Condição que foi testada
- Escreva UM MÉTODO para CADA CONDIÇÃO

______________________Anotações_______________________________________________________________________________________________
- @Test é o que define que aquele método vai ser mapeado e testado pelo jUnit
- @Before define que aquele método vai ser executado antes de todos os testes, por exemplo, se quiser uma uma instância diferente de uma classe
para cada teste, faça um método com anotação @Before onde tu vai instanciar essa classe.
- @AfterTest é executado depois da execução de cada método.
- @BeforeClass a anotação primeiramente deve ser statica, é apenas executado uma vez no começo da classe, normalmente usado pra inicializar 
conexão de database ou coisa assim.
- @AfterClass é o oposto do beforeClass, é executado apenas uma vez no final da execução.

________________________Perfomance________________________________________________________________________________________________
- Tu precisa definir um tempo para fazer aquele teste, sintaxe sendo @Test(timeout = 100), ai no caso ele dá 100 milisegundos para fazer a tarefa.

_______________________Test suite_________________________________________________________________________________________________
- É um agrupamento de classes de teste, uma forma de executar classes especificas de testes, imagine que você fez 10 classes mas não quer testar todas juntas, faz um test suite
e coloca apenas as classes que quer testar, daí é só executar e já foi.


_______________________________________________________________________________________________________________________________________
__________________________________________________________MOCKITO______________________________________________________________________
-informação importante, para cada passo tem um documento no github do curso com anotações, então só vou precisar de anotações pessoais,
segue o link: https://github.com/in28minutes/mockitotutorialforbeginners

O que é Mocking?
R: Mocking é criar objetos que simulam o comportamento de objetos reais, diferentes dos stubs mocks podem ser dinamicamente criados pelo codigo
em tempo de execução, assim você pode verificar chamada de métodos e um monte de outras coisas



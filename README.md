## Padrão de Projeto DAO (Data Access Object)

Ideia geral do padrão DAO
Para cada entidae, haverá um obejto responsável por fazer acesso a dados relacionados a esta entidade. Por exemplo:
    * Cliente: ClienteDao
    * Produto: ProdutoDao
    * Pedido: PedidoDao

Cada DAO será definido por uma interface, pois o acesso aos dados pode migrar de tecnologia. Então para que o sistema fique flexível e preserve o contrato dos objetos de acesso a dados.

A injeção de dependência pode ser feita por meio do padrão Factory
(diagrama 275)


## Department entity class

Entity class checklist:
    Attributes
    Constructors
    Getters/Setters
    hasCode and equals
    toString
    implements Seriazable
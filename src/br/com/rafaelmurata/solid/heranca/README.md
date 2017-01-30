Princípio de Liskov, toda classe filho tem que pensar nas pré-condições e pós-condições do pai, e ela nunca pode quebrar. Na pré-condição, ela nunca pode apertar. E na pós-condição, ela nunca pode afrouxar. 
 fazer bom uso de herança, o desenvolvedor deve pensar em cada método que a classe filha herdou e sobrescreveu, e lembrar que as pré-condições não podem ser apertadas, e as pós-condições não podem serem afrouxadas.
 Você pode fazer uso de composição para reaproveitar comportamentos. Diferente da herança, ao compor um objeto, você não precisa se preocupar com as pré e pós condições.
No entanto, ao fazer uso de herança, você ganha o uso de polimorfismo. Quando bem usada, a herança também é uma excelente opção.
Herança, composição, duas maneiras de reutilizar código. 
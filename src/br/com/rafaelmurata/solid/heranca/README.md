Princ�pio de Liskov, toda classe filho tem que pensar nas pr�-condi��es e p�s-condi��es do pai, e ela nunca pode quebrar. Na pr�-condi��o, ela nunca pode apertar. E na p�s-condi��o, ela nunca pode afrouxar. 
 fazer bom uso de heran�a, o desenvolvedor deve pensar em cada m�todo que a classe filha herdou e sobrescreveu, e lembrar que as pr�-condi��es n�o podem ser apertadas, e as p�s-condi��es n�o podem serem afrouxadas.
 Voc� pode fazer uso de composi��o para reaproveitar comportamentos. Diferente da heran�a, ao compor um objeto, voc� n�o precisa se preocupar com as pr� e p�s condi��es.
No entanto, ao fazer uso de heran�a, voc� ganha o uso de polimorfismo. Quando bem usada, a heran�a tamb�m � uma excelente op��o.
Heran�a, composi��o, duas maneiras de reutilizar c�digo. 
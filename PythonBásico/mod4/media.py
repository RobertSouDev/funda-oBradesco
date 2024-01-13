notaA = float(input("Informe a primeira nota: "))
notaB = float(input("Informe a segunda nota: "))

#calcular a media 

mediafinal = (notaA + notaB) / 2

if mediafinal >= 7.0:
    print("A média: %.1f - Aprovado "% mediafinal)
else:
    print("A Média: %.1f - Reprovado "% mediafinal)


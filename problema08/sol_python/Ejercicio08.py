contador = 1
numero_metros = 1
mensaje = "Metros\t\tYardas\tPulgadas\tPies\n"

print("Escriba la cantidad de metros a convertir")
metro =float(input())

print(mensaje)
while contador <=metro:
    pulgadas= numero_metros * 39.37
    yardas= numero_metros * 3.28084
    pies= numero_metros * 1.04
    print(numero_metros,"\t\t", "{:.3f}".format(pulgadas), "\t", "{:.3f}".format(yardas), "\t\t", "{:.3f}".format(pies), "\n")
    contador =contador + 1
    numero_metros = numero_metros +1
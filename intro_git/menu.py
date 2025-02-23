from calculadora import somar,subtrair,multiplicar,dividir
def menu(opcao):
    while opcao != 0:
        opcao = int(input("1-Somar\n2-Subtrair\n3-Multiplicar\n4-dividir\n0-Sair\n"))
        if opcao == 1:
            print(f"A soma entre {n1} e {n2} é {somar(n1,n2)}")
        elif opcao == 2:
            print(f"A subtração entre {n1} e {n2} é {subtrair(n1,n2)}")
        elif opcao == 3:
            print(f"A multiplicação entre {n1} e {n2} é {multiplicar(n1,n2)}")
        elif opcao == 4:
            print(f"A divisão entre {n1} e {n2} é {dividir(n1,n2)}")
    print("Obrigado por usar a calculadora")
opcao = 5
n1 = int(input("Entre com um número: "))
n2 = int(input("Entre com outro número: "))
menu(opcao)

from calculadora import somar,subtrair,multiplicar,dividir
def menu(opcao):
    while opcao != 0:
        opcao = int(input("1-Somar\n0-sair\n"))
        if opcao == 1:
            print(f"A soma entre {n1} e {n2} é {somar(n1,n2)}")
    print("Obrigado por usar a calculadora")
opcao = 5
n1 = int(input("Entre com um número: "))
n2 = int(input("Entre com outro número: "))
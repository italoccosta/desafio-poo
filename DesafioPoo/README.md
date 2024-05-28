Diagrama de classes do desafio de conceitos de POO da trilha de JAVA no backend DIO


---
classDiagram

    class ReprodutorMusical {
        +Reproduzir()
        +Pausar()
        +SelecionarMusica(String musica)
    }

    class AparelhoTelefonico {
        +RalizarChamada(String numero)
        +AtenderChamada()
        +IniciarCorreioVoz()
    }

    class NavegadorInternet {
        +ExibirPagina(String url)
        +AdicionarAba()
        +AtualizarPagina()
    }

    class iPhone {
    }

    iPhone --> ReprodutorMusical
    iPhone --> AparelhoTelefonico
    iPhone --> NavegadorInternet

---
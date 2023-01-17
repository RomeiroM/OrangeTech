# Principais Protocolos de Comunicação da Internet

## Índice
- Aula 1 - Protocolo de comunicação Web HTTP
  - Etapa 1 - Como funciona o protocolo HTTP?
  - Mensagens HTTP - Request & Response
  - Para que servem Cookies e Cache?
  - HTTP 2.0 - Atualizações do protocolo
  - Servidores/ Sistemas de aplicação 
- HTTPS, o que muda no protocolo?
- Protocolo de comunicação 

## Aula 1 - Protocolo de comunicação Web HTTP

Hyper Text Transfer Protocol (HTTP)) é um protocolo que especifica como será a comunicação entre um navegador e um servidor web, sendo um dos principais da World Wide Web (WWW).

- Definido pelos RFCs 1945 e 2116
- Protocolo de comunicação
- Browser -> implementa o cliente HTTP
- Servidor -> host objetos web
- Cliente
  - Mensagens - Request HTTP (requisita Objetos Web)
- Servidor
  - Mensagens – Response HTTP (responde em protocolo TCP)

### Etapa 1 - Como funciona o protocolo HTTP?

~~~~
Get:http://wwww.amazon.com.br
Host:amazon.com
Connection:close
User-agent:Mozila/5.0
~~~~

Exemplo de mensagem HTTP Response

~~~~
HTTP/1.1 200 OK
Connection:close
Date:Tue, 09 Aug 2011 15:44 GMT
Serve:Apache/2.2;3 (CentOS)
Last-Modified: Tue, 09 Aug 2011 15:11:03GMT
Content-Length:6821
Content-Type:text/html

(data...Amazon initial page)
~~~~

Exemplo de requisição para enviar dados para o servidor:

~~~~
Post: https://www.amazom.com.br/cadastro
Host:amazom.com
Connection:close
User-agent:Mozilla/5.0

...

Data: nome,data de nascimento, contato
...
~~~~

Resposta:
~~~~
HTTP/1.1 200 OK
Connection:close
Date:Tue, 09 Aug 2011 15:44:04 GMT
Serve:Apache/2.2;3 (CentOS)
Last-Modified: Tue, 09 Aug 2011 15:11:03GMT
Content-Length:6821
Content-Type:text/html

(data...Update Succeed)
~~~~

- Ehtensible Markup Language(XML)

~~~~xml
<?xml version="1.o" encoding="UTF-8">
<authentication-context>
    <username>my_username</username>
    <password>my_password</password>
    <validation-factors>
        <validation-factors>
            <name>remote_address</name>
            <value>127.0.0.1</value>
        </validation-factors>
    </validation-factors>
</authentication-context>
~~~~

- JavaScript Object Nation (JSON)

~~~~json
{
    "username" : "my_username",
    "password" : "my_password",
    "validation-factors" : {
        "validationFactors": [
            {
                "name" : "remote_address", 
                "value" : "127.0.0.1"
            }
        ]
    }
}
~~~~

Métodos:

Método | Descrição
:----- | :--------
GET |  Solicita um recurso do servidor
HEAD | GET sem corpo de resposta
POST | Submete uma entidade a um recurso
PUT | Subtituoção de recursos pelos dados da requisição
DELETE | Remoção de um recurso
TRACE | Chamada de loopp-back a um determinado recurso
OPTION | Opções de comunicação com recurso
CONNECT | tunelamento identificado pelo recurso
PATCH | Modificação parcial

**HTTP Response**

Código | Significado
:----- | :---------
200 OK | Request bem sucedida e objeto enviado
301 Moved Permanentlu: | Objeto realocado nova URL no campo Location
400 Bad Request | Rsposta genérica - servidor não entendeu a mensagem
400 Not Found | O documento solicitado é inexistente
505 HTTP Version Not Supported | Versão do protocolo não suportada pelo servidor

**Classificação dos Status Code**

- **Information** response (100-199)
- **Successful** response (200-299)
- **Redirection** response (300-399)
- **Client error** response (400-499)
- **Server error** response (500-599)

#### **Para que serve Cookie e Cache?**

**O que são Cookies?**
Pequenos pedaços ou blocos de dados criados e utilizados pelo servidor para persistir (armazenar) dados no dispositivos do cliente.

###### **Tipos de Cokies**

- **Session Cookies, Cookies de Sessão**

Um Cookie de sessão inicia quando o cliente acessa um site e expira (é apagado) quando o cliente encerra a conexão. Isso significa que os cookies de sessão são deletados após o fim da sessão ou quando o navegador é fechado. Também são conhecidos como temporary cookies (cookies temporários) ou non-persistent cookies (cookies não persistentes). Esse tipo de cookie é definido quando não carregamos os atributos _Expires_ ou _Max-Age_.

E como os cookies de sessão funcionam?

- O servidor cria um ID único para a sessão que é gerado aleatoriamente e armazenado de forma temporária no cookie, como no exemplo: _Set-Cookie: sessionId=38afes7a8_;
- O cookie de sessão não pode ser compartilhado com nenhum outro cliente, pois armazena informações sobre a interação e movimentação do usuário em determinada página e nada mais;
- Um exemplo comum de cookies de sessão é o **carrinho de compras** em uma loja ou e-commerce. Os cookies vão ajudar o site a memorizar os itens selecionados, o endereço, nome e informação de pagamento. Depois de encerrada a sessão, as informações são deletadas.

- **Permanent Cookies, Cookies permanentes**
Os cookies permanentes têm uma data específica para expirar com o atributo _Expires_, confira o exemplo:

~~~~
Set-Cookie: id=a3fWa; Expires=Wed, 25 Jan 2023 07:28:00 GMT
~~~~

Ou expiram após um intervalo de tempo, sem a necessidade do cliente interromper a sessão. Nesse caso, o atributo usado é o Max-Age. Confira a seguir um exemplo de sua aplicação:

~~~~
Set-Cookie: id=a3fWa; Max-Age=2592000
~~~~
Temos o Set-Cookie com o seu nome id e seu valor. Por fim, o atributo Max-Age carregando um valor que define o período em segundos que o cookie irá expirar. Dessa forma, o cookie irá expirar em 2592000 segundos, que é o mesmo que 30 dias.

Os cookies permanentes armazenam as informações sobre o comportamento do usuário de forma local (no seu dispositivo) para fornecer uma melhor experiência de navegação.

A diferença entre os dois tipos de cookies encontra-se no fato de que os permanentes ou não expiram, ou tem uma data específica para isso, e são armazenados no seu dispositivo local. Por outro lado, os cookies de sessão estão armazenados na memória de forma temporária, enquanto a sessão estiver ativa ou até você fechar o seu navegador.

_"O fluxo da operação é o mesmo para os dois tipos de cookies: cliente envia a requisição > servidor recebe e envia uma resposta com o Set-Cookie > cliente recebe a resposta e armazena em cookie."_

- **Cookies First-party e Third-party: Primários e de terceiros**

Ser um cookie de sessão ou permanente, normalmente, não é o real problema para uma pessoa que acessa um site pela primeira vez, ou para uma pessoa desenvolvedora.

O conflito maior está relacionado ao compartilhamento de informações que envolvem a LGPD, pois essa questão faz referência ao escopo dos cookies First-party (Cookie primário) e Third-party (Cookie de terceiros). Em alguns casos há também o Second-party. Confira o quadro a seguir, que relaciona os tipos de cookies e seus respectivos escopos:

**Cookies** | **Escopo**
Cookie primário | Um cookie primário é criado por sites que um usuário visita. Ele é usado para salvar dados, como itens de carrinho de compras, credenciais de entrada. Por exemplo, cookies de autenticação e outras análises.
Cookie secundário | Um cookie secundário é tecnicamente o mesmo que um cookie primário. A diferença é que os dados são compartilhados com uma outra parte por meio de um contrato de parceria de dados. Por exemplo Análise e relatórios do Microsoft Teams.
Cookie de terceiros | Um cookie de terceiros é instalado por um domínio diferente do que o usuário visitou explicitamente e é usado para acompanhamento. Por exemplo, os botões Curtir, serviço de anúncios e chats ao vivo.

##### **Cache**

O cache do navegador é o espaço onde ficam armazenados arquivos estáticos dos sites visitados. Assim, quando você visita novamente a página, o carregamento é feito com mais rapidez e a navegação tem maior agilidade.

O cache do navegador tem a função de ajudar o desempenho das páginas e melhorar a experiência do usuário. Como os dados que ficam armazenados não são mudados com tanta frequência, o conteúdo estático do site é carregado rapidamente — como imagens, arquivos de folha de estilo, JavaScript, HTML e outras informações.

## Aula 2 - HTTTPS - O que muda no protocolo?


### **Segurança da informação**
- Criptografia por chave:
Na criptografia, uma chave é uma sequência de caracteres usada em um algoritmo de criptografia para alterar os dados de forma que pareçam aleatórios. Como uma chave física, ele bloqueia (criptografa) os dados para que apenas alguém com a chave certa possa desbloqueá-los (descriptografá-los).

- Assimétrica
  - Chave privada
    - Assinatura - criptografia
  - Chave pública
    - Verificação de autenticidade
- Simétrica
  - Chave única privada
    - conhecimento prévio da chave
    - Como transferir a chave?

_Criptografia por chave - chave simétrica: Substituição da letra pela k-ésima do alfabeto Rotatividade do alfabeto_

- SSL - Secure Socket Layer - SSL

Certificado SSL é um certificado digital que autentica a identidade de um site e possibilita uma conexão criptografada. O termo "SSL" significa "Secure Sockets Layer" (camada de soquete seguro), um protocolo de segurança que cria um link criptografado entre um servidor Web e um navegador Web.

  - Segurança para conexões TCP
  - Confidencialidade
  - Integridade
  - Autenticidade end-point

**O que é um protocolo WebSocket?**

WebSocket é uma tecnologia avançada para criar uma ligação entre um cliente e um servidor (browser e servidor) e permitir a comunicação entre eles em tempo real. A principal diferença com o WebSocket é que permite receber dados sem ter de enviar um pedido separado, como, por exemplo, acontece no HTTP. Uma vez estabelecida a ligação, os dados virão por si mesmos sem necessidade de enviar o pedido. É a vantagem de utilizar o protocolo WebSocket em chats ou relatórios de stock, onde precisa de receber informação constantemente actualizada. O protocolo pode receber e enviar informação simultaneamente, permitindo uma comunicação bidireccional full-duplex, o que resulta numa troca de informação mais rápida.

**Como funciona o WebSockets?**

A ligação entre cliente e servidor permanece aberta até ser terminada por uma das partes ou ser encerrada por um timeout. Eles executam um aperto de mão para estabelecer uma ligação entre o cliente e o servidor. Uma ligação estabelecida permanece aberta, e a comunicação é efectuada utilizando o mesmo canal até que a ligação seja terminada no lado do cliente ou do servidor. As mensagens são trocadas bidireccionalmente. O WebSocket permite encriptar os dados que são transmitidos. Para tal, é utilizado um suplemento sobre o protocolo WSS, que codifica os dados do lado do remetente e os descodifica do lado do destinatário. Para quaisquer intermediários, a informação permanece encriptada. Sem encriptação, os dados tornam-se um alvo de ameaças

## Rrefêrencias
https://canaltech.com.br/internet/o-que-e-http/

https://www.alura.com.br/artigos/o-que-sao-cookies-como-funcionam?gclid=Cj0KCQiAq5meBhCyARIsAJrtdr42vOngEiSqh9u7eKSir9JFHLxd6P97Smtu2NlAx2SjR7-b5gYg2VwaAs_JEALw_wcB

https://br.hubspot.com/blog/marketing/o-que-e-cache

https://www.evaltec.com.br/criptografia-de-dados-e-gerenciamento-de-chaves/

https://www.cloudflare.com/pt-br/learning/ssl/what-is-a-cryptographic-key/

https://appmaster.io/pt/blog/o-que-sao-websockets-e-como-cria-los
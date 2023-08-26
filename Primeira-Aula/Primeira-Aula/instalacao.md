https://glysns.gitbook.io/java-basico/

Para instalar o OpenJDK no Linux e usar o Java no Visual Studio Code, siga estas etapas:

1. Abra um terminal.

2. Atualize o cache dos pacotes:
   
   ```bash
   sudo apt update
   ```

3. Instale o OpenJDK. O número da versão pode variar, mas você pode substituir "11" pela versão que deseja instalar. Por exemplo, para o OpenJDK 16, você substituiria "openjdk-11" por "openjdk-16".

   ```bash
   sudo apt install openjdk-11-jdk
   ```

4. Verifique se o Java foi instalado corretamente:

   ```bash
   java -version
   ```

Isso deve exibir informações sobre a versão do Java instalada.

Quanto ao Visual Studio Code, você precisará instalar a extensão "Java Extension Pack" para obter suporte completo ao desenvolvimento Java no VS Code. Você pode instalá-la diretamente do VS Code:

1. Abra o VS Code.

2. Vá para a seção "Extensions" (ou pressione `Ctrl+Shift+X`).

3. Pesquise por "Java Extension Pack".

4. Instale a extensão fornecida pela Microsoft.

Após a instalação dessas etapas, você deve estar pronto para começar a desenvolver em Java no Visual Studio Code usando o OpenJDK.


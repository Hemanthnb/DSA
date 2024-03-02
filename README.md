## Development Environment Setup

### macOS (Zsh)

#### 1. Install the Latest JDK

Make sure you have the latest version of JDK (Java Development Kit) installed on your macOS. You can download and install it from the [official Oracle website](https://www.oracle.com/java/technologies/javase-downloads.html).

#### 2. Set Java Path in Zsh Profile

Open your terminal and edit the Zsh profile file (`~/.zshrc`) using your preferred text editor. Add the following line at the end of the file:

```bash
export JAVA_HOME=/path/to/your/jdk
export PATH=$JAVA_HOME/bin:$PATH

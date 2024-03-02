## Development Environment Setup

### macOS (Zsh)

#### 1. Install the Latest JDK

Make sure you have the latest version of JDK (Java Development Kit) installed on your macOS. You can download and install it from the official Oracle website: https://www.oracle.com/java/technologies/javase-downloads.html

#### 2. Set Java Path in Zsh Profile

Open your terminal and edit the Zsh profile file (~/.zshrc) using your preferred text editor. Add the following lines at the end of the file:

```
export JAVA_HOME=/path/to/your/jdk
export PATH=$JAVA_HOME/bin:$PATH
```

Replace /path/to/your/jdk with the actual path where JDK is installed on your system. Save the file and exit the text editor.

### Additional Configuration

After adding the environment variables, you might want to provide additional instructions or explanations:

Remember to replace /path/to/your/jdk with the actual path where JDK is installed on your system.

After saving the changes, reload the Zsh profile for the changes to take effect:
```
source ~/.zshrc
```
This will ensure that the changes to the JAVA_HOME and PATH variables are applied.

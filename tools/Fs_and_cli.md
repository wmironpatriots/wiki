# A Guide to File Systems and the Command-line Interface
Lets take a look at how File Systems work and how we can navigate them using the Command-line Interface (CLI)

## What is a File System?
Your operating system organizes itself into a hierarchal structure made of various different folders and files. This organization is governed and defined by what we call the File System.

There are two main components in a file system:
* ***Files*** are collections of data stored on your computer, often identified by a name like `lab_report.pdf`
* ***Directories*** aka Folders, are used to segregate files into groups.

Here is an example file system of a computer
```Bash
# The File System starts at the root directory, the directory that contains all files and subdirectories aka the top level directory
/
    📁 bin/ 
    📁 var/
    ...                         # < ----- Here we skip a few lines
    📁 home/
        📁 dabeycorn/              # < ----- This is a user directory    
            📁 documents/
                lab_report.pdf
                📁 memes/
                    funny.png
                ...
            📁 downloads/
                virus.exe
                ...
            📁 music/
                megalovania.mp3
                never_gonna_give_you_up.mp3
                ...
```

## Paths
When we want to talk about files and directories, we use paths. A path is a string that identifies a unique file or directory.

```Bash
# Here we have the path of user dabeycorn's documents directory
/home/dabeycorn/documents/

/home/dabeycorn/music/megalovania.mp3
```

There are two type of paths
* ***Absolute Paths*** a path that provides the location of a file or directory from a fixed point. An example of this would be a path starting at the root directory `/home/dabeycorn/downloads/` where `/` represents starting from the top-level directory. Another example would be starting from the user directory `~/downloads/`. This path is the same as the previous one, expect since we are presumably signed in as the user dabeycorn, we can use the `~/` to start at the fixed point of our home directory.
* ***Relative Path*** a path that provides the location of a file or directory from the point that the user is currently at. For example, if the user is in the `~/documents` directory, they can use the following path to describe a file: `./memes/funny.png` where `./` refers to the current directory. We can also use the `../` sequence in our path to go out of the directory we are currently in. Ex (user is in the `~/documents` dir): `../downloads/virus.exe`

## How can we navigate the File System?
By using the Command-Line Interface (CLI)! The CLI is a text-based interface used for interacting with your operating system via commands. The CLI may seem daunting in comparison with Graphical User Interfaces that users have used in the past (such as Finder and File Explorer), but it's much more verstile and efficent to use in most cases

## Using the CLI
If you are on windows, press the windows key + r, then type in `wt` and enter.

if you are on linux, press cntrl + alt + t.

if you are on mac, press command + space, search up terminal, press enter.

## Basic CLI Usage
When you first open the terminal, you will likely show what's called the prompt:
```Bash
[username@localhost ~]$ 
```
The prompt may look different depending on your operating system. The prompt tells you a few things:
* Your username
* Your current directory (cli usually starts at the home directory or `~`)
* Your CLI is ready to run commands

Once you see your prompt, you can type out commands that you want to run. When you want to run the command that you've written out, just press enter.

When typing in a command, pressing tab will auto complete to the command closets to what you've typed so far. Pressing tab again will auto complete to the next closest command.

Pressing up and down arrows will let you navigate through the commands that you've previously run. Pressing cntrl + r will allow you to search through the commands you've already run by typing.

## Basic CLI Commands
In this section we will go over the following commands
* `clear` (must know)
* `pwd` (must know)
* `ls` (must know)
* `cd` (must know)
* `mkdir` (must know)
* `touch` or `echo >` (must know)
* `cat`
* `cp`
* `robocopy`
* `mv`
* `rm`
* `diff` or `fc.exe`

For simplicity, the prompt will be simplified to `[~/]$` from now on, only showing the current directory.

### `clear`
The `clear` command clears all text currently in the terminal.

### `pwd`
The **p**rint **w**orking **d**irectory command prints the **absolute path** of the directory you are currently in. 

```bash
[~/documents]$ pwd
/home/dabeycorn/documents/
```

### `ls`
The list command lists all files and directories in your current working directory.

```bash
[~/documents]$ ls
lab_report.pdf  memes
```

By itself, the ls command isn't very descriptive. We can change this by using the long listing format flag (`-l`)

```bash
[~/documents]$ ls -l
total 2
drwxr-xr-x 2 user group 4096 May 25 10:45 memes
-rw-r--r-- 1 user group 123  May 25 10:45 lab_report.pdf
# filetypeandperms numberofhardlinks owner group filesize lastmodifydate name
```

Hidden files and directories have a `.` infront of their file name. For example, the file `.secret_message.txt` is hidden from view usually. Using the `-a` flag allows ls to show these files to the user

```bash
[~/documents]$ ls -la # using the long listing format and showing hidden files
total 2
drwxr-xr-x 2 user group 4096 May 25 10:45 memes
-rw-r--r-- 1 user group 123  May 25 10:45 lab_report.pdf
-rw-r--r-- 1 user group 123  May 24 10:45 .secret_message.txt
```

If you wish to learn more about `ls`, you can check out the [wikipedia page](https://en.wikipedia.org/wiki/Ls)

### `cd`
The **c**hange **d**irectory command is used to change the user's working directory. By inputing a path, the user can move to whatever directory they want

```Bash
[/]$ cd /home/dabeycorn/documents
[~/documents]$ cd /bin
```

The cool thing about `cd` is that it works for any sort of path, meaning both **Absolute** and **Relative paths** work.

```Bash
[~/documents]$ cd ./memes # here we are inside the documents folder, so we just use the relative path `./memes` to go inside ~/documents/memes
```

### `mkdir`
The make directory command is a ***UNIX SYSTEMS ONLY (Mac or Linux)*** command that allows you to create directories. Simply specify the name of the directory, and you can create it

```Bash
[~/documents]$ mkdir homework
[~/documents]$ ls
homework    memes   lab_report.pdf
```

### `touch`
The `touch` command can be used to create files.

```
[~]$ touch hello_world.c
[~]$ ls
documents   downloads   music   hello_world.c
```

### `echo >`
Annoyingly, windows does not have the touch command. Instead, you will have to use the `echo` command to create files in terminal. Normally running `echo` with an arguement will just spit back that arguement as output:

```Bash
[~]$ echo man
man
```

However, `echo` can also output arguments into a file. By running `echo > filename` and then pressing enter again when the supply prompt shows up, will create a new blank file.

```Bash
[~]$ echo > hello_world.c

# the cli will output this garble
cmdlet Write-Output at command pipeline position 1
Supply values for the following parameters:
InputObject[0]: # press enter again here

[~]$ ls
documents   downloads   music   hello_world.c
```

### ```cat```
The concatenate command can be used to display the contents of a file

```Bash
[~]$ cat hello_world.c
#include <stdio.h>

int main()
{
    printf("Hello World!");
    return 0;
}
```

### ```cp```
The copy command is a ***UNIX SYSTEMS ONLY (Mac and Linux)*** a command that can be used to copy files.

```Bash
[~]$ ls
documents   downloads   music   hello_world.c
[~]$ cp ./hello_world.c ./documents
[~]$ ls ./documents
lab_report.pdf  hello_world.c  memes   homework
```

The command may also be used for copying directories, though you will need to use the `-r` flag

```Bash
[~]$ ls
documents   downloads   music   hello_world.c
[~]$ cp -r ./music ./documents
[~]$ ls ./documents
lab_report.pdf  memes   homework    music   
```

### `robocopy`
The robust copy command is the windows equivalent of the `cp` command.

```Bash
[~]$ robocopy ./hello_world.c ./documents
[~]$ robocopy ./music ./documents # notice how you don't need flag to copy directories
```

### `mv`
The `cp`/`robocopy` command only creates a copy of a file or directory. We can move instead of just cloning files and directories by using the move command.

```Bash
[~]$ mv ./hello_world.c ./documents # again no -r flag is needed
```

### `rm`
The remove command can be used to permanently delete files or directories.

```Bash
[~]$ rm ./hello_world.c
[~]$ rm -rf ./music # removing directory, need the -r flag. The -f flag makes it so it just deletes every file in there without asking if you want to keep them.
```

### `diff`
The difference command is a ***UNIX SYSTEM ONLY*** command used to check the difference between two files.

```Bash
[~]$ diff ./data_expected.txt ./data_actual.txt
```

### `fc.exe`
`fc.exe` is the windows equivalent of the `diff` command.

```Bash
[~]$ fc ./data_expected.txt ./data_actual.txt
```

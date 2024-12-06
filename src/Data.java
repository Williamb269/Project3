public class Data {
    public Data() {}

    public String getASCIIArt(int idx) {
        switch (idx) {
            case 0:
                return "       ███▄ ▄███▓ ██▀███          ███▄ ▄███▓ ██▓ ██▓     ██▓    ▓█████  ██▀███\n" +
                        "      ▓██▒▀█▀ ██▒▓██ ▒ ██▒       ▓██▒▀█▀ ██▒▓██▒▓██▒    ▓██▒    ▓█   ▀ ▓██ ▒ ██▒\n" +
                        "      ▓██    ▓██░▓██ ░▄█ ▒       ▓██    ▓██░▒██▒▒██░    ▒██░    ▒███   ▓██ ░▄█ ▒\n" +
                        "      ▒██    ▒██ ▒██▀▀█▄         ▒██    ▒██ ░██░▒██░    ▒██░    ▒▓█  ▄ ▒██▀▀█▄\n" +
                        "      ▒██▒   ░██▒░██▓ ▒██▒ ██▓   ▒██▒   ░██▒░██░░██████▒░██████▒░▒████▒░██▓ ▒██▒\n" +
                        "      ░ ▒░   ░  ░░ ▒▓ ░▒▓░ ▒▓▒   ░ ▒░   ░  ░░▓  ░ ▒░▓  ░░ ▒░▓  ░░░ ▒░ ░░ ▒▓ ░▒▓░\n" +
                        "      ░  ░      ░  ░▒ ░ ▒░ ░▒    ░  ░      ░ ▒ ░░ ░ ▒  ░░ ░ ▒  ░ ░ ░  ░  ░▒ ░ ▒░\n" +
                        "      ░      ░     ░░   ░  ░     ░      ░    ▒ ░  ░ ░     ░ ░      ░     ░░   ░\n" +
                        "             ░      ░       ░           ░    ░      ░  ░    ░  ░   ░  ░   ░\n" +
                        " ██▓ ███▄    █    ▄▄▄█████▓ ██░ ██ ▓█████     ██░ ██  ▄▄▄       ██▓     ██▓      ██████\n" +
                        "▓██▒ ██ ▀█   █    ▓  ██▒ ▓▒▓██░ ██▒▓█   ▀    ▓██░ ██▒▒████▄    ▓██▒    ▓██▒    ▒██    ▒\n" +
                        "▒██▒▓██  ▀█ ██▒   ▒ ▓██░ ▒░▒██▀▀██░▒███      ▒██▀▀██░▒██  ▀█▄  ▒██░    ▒██░    ░ ▓██▄\n" +
                        "░██░▓██▒  ▐▌██▒   ░ ▓██▓ ░ ░▓█ ░██ ▒▓█  ▄    ░▓█ ░██ ░██▄▄▄▄██ ▒██░    ▒██░      ▒   ██▒\n" +
                        "░██░▒██░   ▓██░     ▒██▒ ░ ░▓█▒░██▓░▒████▒   ░▓█▒░██▓ ▓█   ▓██▒░██████▒░██████▒▒██████▒▒\n" +
                        "░▓  ░ ▒░   ▒ ▒      ▒ ░░    ▒ ░░▒░▒░░ ▒░ ░    ▒ ░░▒░▒ ▒▒   ▓▒█░░ ▒░▓  ░░ ▒░▓  ░▒ ▒▓▒ ▒ ░\n" +
                        " ▒ ░░ ░░   ░ ▒░       ░     ▒ ░▒░ ░ ░ ░  ░    ▒ ░▒░ ░  ▒   ▒▒ ░░ ░ ▒  ░░ ░ ▒  ░░ ░▒  ░ ░\n" +
                        " ▒ ░   ░   ░ ░      ░       ░  ░░ ░   ░       ░  ░░ ░  ░   ▒     ░ ░     ░ ░   ░  ░  ░\n" +
                        "         ▒█████    █████▒    ▄▄▄▄   ░██░▄█▀   ▄▄▄█████▓▓█████ ▄████▄  ░██░ ██ ░    ░\n" +
                        "        ▒██▒  ██▒▓██   ▒    ▓█████▄  ██▄█▒    ▓  ██▒ ▓▒▓█   ▀▒██▀ ▀█  ▓██░ ██▒\n" +
                        "        ▒██░  ██▒▒████ ░    ▒██▒ ▄██▓███▄░    ▒ ▓██░ ▒░▒███  ▒▓█    ▄ ▒██▀▀██░\n" +
                        "        ▒██   ██░░▓█▒  ░    ▒██░█▀  ▓██ █▄    ░ ▓██▓ ░ ▒▓█  ▄▒▓▓▄ ▄██▒░▓█ ░██\n" +
                        "        ░ ████▓▒░░▒█░       ░▓█  ▀█▓▒██▒ █▄     ▒██▒ ░ ░▒████▒ ▓███▀ ░░▓█▒░██▓\n" +
                        "        ░ ▒░▒░▒░  ▒ ░       ░▒▓███▀▒▒ ▒▒ ▓▒     ▒ ░░   ░░ ▒░ ░ ░▒ ▒  ░ ▒ ░░▒░▒\n" +
                        "          ░ ▒ ▒░  ░         ▒░▒   ░ ░ ░▒ ▒░       ░     ░ ░  ░ ░  ▒    ▒ ░▒░ ░\n" +
                        "        ░ ░ ░ ▒   ░ ░        ░    ░ ░ ░░ ░      ░         ░  ░         ░  ░░ ░\n" +
                        "            ░ ░              ░      ░  ░                  ░  ░ ░       ░  ░  ░\n" +
                        "                                  ░                          ░";
            case 1:
                return "                            ___                                  __\n" +
                        "                           / _ \\ ____ ___  ___  ___   ___  ___  / /_ ___  ____\n" +
                        "                          / ___// __// -_)(_-< (_-<  / -_)/ _ \\/ __// -_)/ __/\n" +
                        "                         /_/   /_/   \\__//___//___/  \\__//_//_/\\__/ \\__//_/\n" +
                        "                               / /_ ___    ___ / /_ ___ _ ____ / /_\n" +
                        "                              / __// _ \\  (_-</ __// _ `// __// __/\n" +
                        "                              \\__/ \\___/ /___/\\__/ \\_,_//_/   \\__/";
            case 2:
                return "  ___ _\n" +
                        " / __| |_ ___ _ _ _  _\n" +
                        " \\__ \\  _/ _ \\ '_| || |  _   _   _\n" +
                        " |___/\\__\\___/_|  \\_, | (_) (_) (_)\n" +
                        "                  |__/";
        }
        return "";
    }

    public String getMiscText(int idx) {
        switch (idx) {
            case 0:
                return "Controls:\n" +
                        "←, ↑, →, and ↓ to move\n" +
                        "1, 2, 3, and 4 to choose options in battle\n" +
                        "That's basically it, press enter to continue.";
            case 1:
                return "Mr. Miller was a man living a simple life. He taught AP Computer Science A\n" +
                        "at Brooklyn Technical High School, and every day, he would return home\n" +
                        "to his loving family.\n" +
                        "\n" +
                        "However, one day he got a phone call that, unbeknownst to him, would change his life forever.\n" +
                        "\n" +
                        "On the other end of the line, a voice told him of his mission.\n" +
                        "\n" +
                        "A demon had taken over Brooklyn Tech, causing massive structural damage as well as possessing\n" +
                        "several teachers. Mr. Miller knew that he was the only person who could defeat this creature, so\n" +
                        "he set out and arrived at Brooklyn Tech, fully prepared to defeat it.";
        }
        return "";
    }

    public String[][] getRoomData(int idx) {
        String[][] roomStr = new String[13][45];
        String map = "######      #####           #####      ######" +
                "###                                       ###" +
                "###                                       ###" +
                "###___________|_______________|___________###" +
                "###___________|_______________|___________###" +
                "###___________|_______________|___________###" +
                "###                                       ###" +
                "#                                           #" +
                "#                                           #" +
                "#                                           #" +
                "#                                           #" +
                "#                                           #" +
                "##########-----####-------####-----##########";
        switch (idx) {
            case 1:
                roomStr = new String[13][45];
                map = "######      #####           #####      ######" +
                        "###                                       ###" +
                        "###                                       ###" +
                        "###___________|_______________|___________###" +
                        "###___________|_______________|___________###" +
                        "###___________|_______________|___________###" +
                        "#                                         ###" +
                        "#                                           #" +
                        "#                                           #" +
                        "#                                           #" +
                        "#                                           #" +
                        "#                                           #" +
                        "##########-----####-------####-----##########";
        }
        int width = roomStr[0].length;
        int height = roomStr.length;
        int mapIndex = 0;
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                roomStr[i][j] = map.substring(mapIndex, mapIndex + 1);
                mapIndex++;
            }
        }
        return roomStr;
    }
}

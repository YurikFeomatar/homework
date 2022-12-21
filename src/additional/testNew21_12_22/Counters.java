package additional.testNew21_12_22;

import additional.testNew21_12_22.api.ICounter;

public class Counters implements ICounter {
    private int pack = 0;
    private int hiddenFiles = 0;
    private int commonFiles = 0;
    private int txtFiles = 0;

    @Override
    public int getPack() {
        return pack ++;
    }

    @Override
    public int getFiles() {
        return commonFiles++;
    }

    @Override
    public int getHiddenFiles() {
        return hiddenFiles++;
    }

    @Override
    public int getTxtFiles() {
        return txtFiles++;
    }
    public String toString() {
        return (
            "Папки: " + this.pack + "\nВсего файлов: " +
            this.commonFiles+ "\nСкрытых файлов: " +
            this.hiddenFiles+"\ntxtФайлы: " + this.txtFiles
        );
    }
}

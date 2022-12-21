package additional.testNew21_12_22;

import additional.testNew21_12_22.api.ICounter;

import java.io.File;
public class DirectoryReader {
    private ICounter object = new Counters();

    public void fileReader(File file) {
        if (file.isDirectory()) {
            System.out.println("Directory of " + file);
            String[] s = file.list();
            if (s != null) {
                for (String value : s) {
                    File f = new File(file + "/" + value);
                    if (f.isFile()) {
                        object.getFiles();
                        if (file.isHidden()) {
                            object.getHiddenFiles();
                        }
                        if (file.getPath().endsWith(".txt")) {
                            object.getTxtFiles();
                        }
                    }
                    if (file.isDirectory()) {
                        object.getPack();
                        fileReader(f);
                    }
                }
            }
        }
    }

    public String getResult() {
        return this.object.toString();
    }
}

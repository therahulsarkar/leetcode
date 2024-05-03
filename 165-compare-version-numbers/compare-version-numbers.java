class Solution {
    public int compareVersion(String version1, String version2) {
        String[] vs1 = version1.split("\\.");
        String[] vs2 = version2.split("\\.");

        int m = vs1.length;
        int n = vs2.length;

        int size = Math.max(m,n);

        for (int i = 0; i < size; i++) {

            int p = i < m ? Integer.parseInt(vs1[i]) : 0;
            int q = i < n ? Integer.parseInt(vs2[i]) : 0;

            if (p < q)
                return -1;
                
            else if (p > q)
                return 1;
        }

        return 0;
    }
}
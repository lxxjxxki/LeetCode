class Solution {
    public int largestAltitude(int[] gain) {
        int altitudesLen = gain.length + 1;
        int[] altitudes = new int[altitudesLen];
        altitudes[0] = 0;

        for (int i = 0; i < altitudesLen - 1; i++) {
            altitudes[i + 1] = altitudes[i] + gain[i];
        }
        Arrays.sort(altitudes);
        return altitudes[altitudesLen - 1];
    }
}
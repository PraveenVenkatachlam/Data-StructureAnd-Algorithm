//! 981. Time Based Key-Value Store

class TimeMap {

    static class Pair {
        int timestamp;
        String value;

        Pair(String v, int t) {
            this.timestamp = t;
            this.value = v;
        }
    }

    private Map<String, List<Pair>> map = new HashMap<>();

    public TimeMap() {

    }

    public void set(String key, String value, int timestamp) {

        if (!map.containsKey(key)) {
            map.put(key, new ArrayList<>());
        }

        map.get(key).add(new Pair(value, timestamp));
    }

    public String get(String key, int timestamp) {

        if (!map.containsKey(key)) {
            return "";
        }

        return findValueAtOrBeforeTimestamp(
            map.get(key),
            timestamp
        );
    }

    private String findValueAtOrBeforeTimestamp(
        List<Pair> list,
        int timestamp
    ) {

        int left = 0;
        int right = list.size() - 1;

        String res = "";

        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (list.get(mid).timestamp <= timestamp) {
                res = list.get(mid).value;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return res;
    }
}

/**
 * Your TimeMap object will be instantiated and called as such:
 * TimeMap obj = new TimeMap();
 * obj.set(key,value,timestamp);
 * String param_2 = obj.get(key,timestamp);
 */
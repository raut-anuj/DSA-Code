class Solution {
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        List<int[]> list = new ArrayList<>();
        dfs(root, 0, 0, list);

        Collections.sort(list, (a, b) -> {
            if (a[0] != b[0]) return a[0] - b[0]; // col
            if (a[1] != b[1]) return a[1] - b[1]; // row
            return a[2] - b[2]; // value
        });

        List<List<Integer>> res = new ArrayList<>();
        int prevCol = Integer.MIN_VALUE;

        for (int[] arr : list) {
            if (arr[0] != prevCol) {
                res.add(new ArrayList<>());
                prevCol = arr[0];
            }
            res.get(res.size() - 1).add(arr[2]);
        }

        return res;
    }

    public void dfs(TreeNode node, int row, int col, List<int[]> list) {
        if (node == null) return;

        list.add(new int[]{col, row, node.val});

        dfs(node.left, row + 1, col - 1, list);
        dfs(node.right, row + 1, col + 1, list);
    }
}
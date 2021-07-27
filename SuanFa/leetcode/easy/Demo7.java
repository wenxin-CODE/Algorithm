package leetcode.easy;

//二叉树中第二小的节点
// https://leetcode-cn.com/problems/second-minimum-node-in-a-binary-tree/solution/er-cha-shu-zhong-di-er-xiao-de-jie-dian-bhxiw/

//细节
//
//根据题目要求，如果第二小的值不存在的话，输出 -1−1，那么我们可以将 \textit{ans}ans 的初始值置为 -1−1。在遍历的过程中，如果当前节点的值严格大于 \textit{rootvalue}rootvalue 的节点时，那么只要 \textit{ans}ans 的值为 -1−1 或者当前节点的值严格小于 \textit{ans}ans，我们就需要对 \textit{ans}ans 进行更新。
//
//此外，如果当前节点的值大于等于 \textit{ans}ans，那么根据「思路」部分，以当前节点为根的子树中所有节点的值都大于等于 \textit{ans}ans，我们就直接回溯，无需对该子树进行遍历。这样做可以省去不必要的遍历过程。

public class Demo7 {
}

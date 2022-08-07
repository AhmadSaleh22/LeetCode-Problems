/**
 * Definition for a binary tree node.
 * function TreeNode(val, left, right) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.left = (left===undefined ? null : left)
 *     this.right = (right===undefined ? null : right)
 * }
 */
/**
 * @param {TreeNode} root
 * @return {TreeNode}
 */
var invertTree = function(root) {
    const reverse = (node) => {
        if(node == null) return;
        invertTree(node.left);
        invertTree(node.right);
        
        
        let handle = node.right;
        node.right = node.left;
        node.left = handle;
        
    }
    
    reverse(root);
    
    return root;
    
};
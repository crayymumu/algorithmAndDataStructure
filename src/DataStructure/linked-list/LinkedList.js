import Comparator from '../../utils/comparator/Comparator'

export default class LinkedList {
  constructor(comparatorFunction) {
    this.head = null
    this.tail = null
    this.compare = new Comparator(comparatorFunction)
  }

  // 前插
  prepend() {}

  // 尾插
  append() {}

  // 删除
  delete() {}

  // 寻找指定元素
  find() {}

  // 删尾
  deleteTail() {}

  // 删头
  deleteHead() {}

  /**
   * @return {LinkedListNode[]}
   */
  toArray() {
    const nodes = []

    let currentNode = this.head
    while (currentNode) {
      nodes.push(currentNode)
      currentNode = currentNode.next
    }

    return nodes
  }

  /**
   * @param {function} [callback]
   * @return {string}
   */
  toString(callback) {
    return this.toArray().map(node => node.toString(callback)).toString()
  }
}

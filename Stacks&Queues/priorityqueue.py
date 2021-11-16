
#create a new node
class pnode:
    def __init__(self, value, pr):
	    self.data = value
	    self.priority = pr
	    self.next = None
		
class pqueue:
	def __init__(self):	
		self.head = None

	def isEmpty(self):
		return self.head == None           
        
	def enqueue(self, value, priority):
		if self.isEmpty() == True:
			self.head = pnode(value,priority)
		else:
			if self.head.priority > priority:
				newnode = pnode(value,priority) 
				newnode.next = self.head
				self.head = newnode
				
			else:
				temp = self.head
				while temp.next:
					if priority <= temp.next.priority:
						break
					temp = temp.next
				
				newNode = pnode(value,priority)
				newNode.next = temp.next
				temp.next = newNode
				
	def dequeue(self):
		
		if self.isEmpty() == True:
			return
		else:	
			self.head = self.head.next

	def peek(self):
		if self.isEmpty() == True:
			return
		else:
			return self.head.data
	
	def display(self):
		if self.isEmpty() == True:
			return "Empty queue"
		else:
			temp = self.head
			while temp:
				print(temp.data, end = " ")
				temp = temp.next




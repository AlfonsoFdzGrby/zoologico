class Zoo:
    def __init__(self, access_password):
        self.employee_list = []
        self.visitor_list = []
        self.animal_list = []
        self.visit_list = []
        self.maintenance_list = []
        self.access_password = access_password
    
    def add_employee(self, employee):
        self.employee_list.append(employee)
    
    def add_visitor(self, visitor):
        self.visitor_list.append(visitor)
    
    def add_visit(self, visit):
        self.visit_list.append(visit)
    
    def add_animal(self, animal):
        self.animal_list.append(animal)
    
    def add_maintenance(self, maintenance):
        self.maintenance_list.append(maintenance)
    
    def get_employees(self):
        return self.employee_list
    
    def get_visitors(self):
        return self.visitor_list
    
    def get_visits(self):
        return self.visit_list
    
    def get_animals(self):
        return self.animal_list
    
    def get_maintenance(self):
        return self.maintenance_list

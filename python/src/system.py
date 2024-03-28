from datetime import datetime
from zoo import Zoo
from employee import Employee
from visitor import Visitor
from visit import Visit
from animal import Animal
from maintenance import Maintenance

class System:
    def __init__(self):
        self._zoo = Zoo("password")

    def get_zoo(self):
        return self._zoo

    def set_zoo(self, value):
        self._zoo = value

    def execute(self):
        while True:
            print("************************************")
            print("Welcome to the Morelia Zoo Management System")
            print("1. Register new employee")
            print("2. Register new visitor")
            print("3. Register new visit")
            print("4. Register new animal")
            print("5. Register maintenance task")
            print("6. Consult registered employees")
            print("7. Consult registered visitors")
            print("8. Consult registered visits")
            print("9. Consult registered animals")
            print("10. Consult registered maintenance tasks")
            print("11. Modify employee")
            print("12. Modify animal")
            print("13. Modify visitor")
            print("14. Exit")
            print("************************************")
            print("Enter your choice: ")

            choice = input()

            if choice == '1':
                self.register_employee()
            elif choice == '2':
                self.register_visitor()
            elif choice == '3':
                self.register_visit()
            elif choice == '4':
                self.register_animal()
            elif choice == '5':
                self.register_maintenance()
            elif choice == '6':
                self.list_employees()
            elif choice == '7':
                self.list_visitors()
            elif choice == '8':
                self.list_visits()
            elif choice == '9':
                self.list_animals()
            elif choice == '10':
                self.list_maintenance()
            elif choice == '11':
                self.modify_employee()
            elif choice == '12':
                self.modify_animal()
            elif choice == '13':
                self.modify_visitor()
            elif choice == '14':
                print("Exiting program...")
                break
            else:
                print("Invalid choice! Please try again.")

    def register_employee(self):
        name = input("Enter employee's name: ")
        last_name = input("Enter employee's last name: ")
        birth_date = input("Enter employee's birth date (YYYY-MM-DD): ")
        hire_date = input("Enter employee's hire date (YYYY-MM-DD): ")
        rfc = input("Enter employee's RFC: ")
        curp = input("Enter employee's CURP: ")
        salary = float(input("Enter employee's salary: "))
        schedule = input("Enter employee's schedule: ")
        role = input("Enter employee's role: ")

        employee = Employee(name, last_name, datetime.strptime(birth_date, '%Y-%m-%d'), datetime.strptime(hire_date, '%Y-%m-%d'), rfc, curp, salary, schedule, role)
        self._zoo.add_employee(employee)
        print("Employee registered successfully!")

    def register_visitor(self):
        name = input("Enter visitor's name: ")
        last_name = input("Enter visitor's last name: ")
        birth_date = input("Enter visitor's birth date (YYYY-MM-DD): ")
        curp = input("Enter employee's CURP: ")
        register_date = input("Enter visitor's register date (YYYY-MM-DD): ")

        visitor = Visitor(name, last_name, datetime.strptime(birth_date, '%Y-%m-%d'), curp, datetime.strptime(register_date, '%Y-%m-%d'))
        self._zoo.add_visitor(visitor)
        print("Visitor registered successfully!")

    def register_visit(self):
        guide = input("Enter guide's name: ")
        visitors = input("Enter visitor's names: (separate the names using commas ',') ").split(',')
        visit_date = input("Enter the visit date (YYYY-MM-DD): ")
        num_children = int(input("Enter the number of children: "))
        num_adults = int(input("Enter the number of adults: "))
        total_cost = float(input("Enter the total cost of the visit: "))

        visit = Visit(guide, visitors, total_cost, datetime.strptime(visit_date, '%Y-%m-%d'), num_children, num_adults)
        self._zoo.add_visit(visit)
        print("Visit registered successfully!")

    def register_animal(self):  
        animal_type = input("Enter the animal type: ")
        birth_date = input("Enter the animal's birth date (YYYY-MM-DD): ")
        arrival_date = input("Enter the animal's arrival date (YYYY-MM-DD): ")
        weight = float(input("Enter the animal's weight: "))
        diseases = input("Enter the animal's diseases (comma-separated): ").split(',')
        feeding_frequency = input("Enter the animal's feeding frequency: ")
        feeding_type = input("Enter the animal's feeding type: ")
        vaccinated = input("Does the animal have vaccines? (y/n): ").lower() == 'y'

        animal = Animal(animal_type, datetime.strptime(birth_date, '%Y-%m-%d'), datetime.strptime(arrival_date, '%Y-%m-%d'), weight, diseases, feeding_frequency, feeding_type, vaccinated)
        self._zoo.add_animal(animal)
        print("Animal registered successfully!")

    def register_maintenance(self):
        responsible_employee = input("Enter the responsible employee's name: ")
        animal_id = input("Enter the ID of the animal or zoo area: ")
        process_done = input("Enter the process done: ")
        process_date = input("Enter the process date (YYYY-MM-DD): ")
        observations = input("Enter observations: ")

        maintenance = Maintenance(responsible_employee, animal_id, process_done, datetime.strptime(process_date, '%Y-%m-%d'), observations)
        self._zoo.add_maintenance(maintenance)
        print("Maintenance task registered successfully!")

    def list_employees(self):
        print("Registered employees: ")
        employees = self._zoo.get_employees()
        for employee in employees:
            print(employee.get_name())

    def list_visitors(self):
        print("Registered visitors: ")
        visitors = self._zoo.get_visitors()
        for visitor in visitors:
            print(visitor.get_name())

    def list_visits(self):
        print("Registered visits: ")
        visits = self._zoo.get_visits()
        for visit in visits:
            print("Guide: ", visit.get_guide())
            print("Visitors:", ", ".join(visit.get_visitors()))
            print("Total cost: ", visit.get_total_cost())
            print("Visit Date: ", visit.get_visit_date())
            print("Number of children: ", visit.get_num_children())
            print("Number of Adults:", visit.get_num_adults())


    def list_animals(self):
        print("Registered animals: ")
        animals = self._zoo.get_animal_list()
        for animal in animals:
            print("Animal Type: ", animal.get_animal_type())
            print("Date of Birth: ", animal.get_birth_date().strftime('%Y-%m-%d'))
            print("Arrival Date: ", animal.get_arrival_date().strftime('%Y-%m-%d'))
            print("Weight: ", animal.get_weight())
            print("Diseases: ", ", ".join(animal.get_diseases()))
            print("Feeding frequency: ", animal.get_feeding_frequency())
            print("Feeding type: ", animal.get_feeding_type())
            print("Vaccinated: ", animal.is_vaccinated())


    def list_maintenance(self):
        print("Registred maintenance: ")
        maintenances = self._zoo.get_maintenance
        for maintenance in maintenances:
            print(maintenance.get_employee_in_charge)

    

            

            




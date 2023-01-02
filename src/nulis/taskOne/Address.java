package nulis.taskOne;

   class Address {
    private Town town;

       public Address(Town town) {
           this.town = town;
       }

       public Town getTown() {
           return town;
       }

       public void setTown(Town town) {
           this.town = town;
       }
   }

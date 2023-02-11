import './employee.css'

const companyInfo={
    name:'auidintel india',
    location:'czec colony erragadda',
    city:'hyderabad',
    pin:'66786767',
    state:'telengana',
    country:'india'
}

function Header(){
   return (
    <div className="style1">
          <h1>{companyInfo.name}</h1>
          <label>Location:{companyInfo.location}</label><br></br>
          <label>City:{companyInfo.city}</label><br></br>
          <label>Pin:{companyInfo.pin}</label><br></br>
          <label>State:{companyInfo.state}</label><br></br>
          <p>Country:{companyInfo.country}</p><br></br>
           
    </div>
   )
}
export default Header
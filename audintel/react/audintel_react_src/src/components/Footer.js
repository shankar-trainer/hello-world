const footerInfo={
    copyright:'copy right reserves to audintel india pvt ltd',
    date:'2017',
    contact:6767767
};

//function Footer()
const Footer=()=>
{
    return(
        <div className="style1" style={{background:'orange'}}>
            <h2>{footerInfo.copyright}</h2>
            <label>Date : {footerInfo.date}</label><br></br>
            <label>Contact : {footerInfo.contact}</label><br></br>
        </div>
    )
}

export default Footer
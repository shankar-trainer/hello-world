import ThemeContext from "./ThemeContext";

const App33=()=>(
    <div>
        <PrimaryHeadLine>
            Hello React Context
        </PrimaryHeadLine>
        <Paragraph>
            This is how you use childrenin React by the way 
        </Paragraph>

        <SecondaryHeadLine>
            With a React useContext Hook instead of Consumer component this time 
            </SecondaryHeadLine>
    </div>
);

const PrimaryHeadLine=({children})=>(
    <ThemeContext.Consumer>
        {
            value=><h1 style={{color:value}}>{children}</h1>
        }
    </ThemeContext.Consumer>
)
const Paragraph=({children})=>(
    <ThemeContext.Consumer>
        {
            color=><p style={{color:color}}>{children}</p>
        }
    </ThemeContext.Consumer>
)

const SecondaryHeadLine=({children})=>(
    <ThemeContext.Consumer>
        {
            value=><h2 style={{color}}>{children}</h2>
        }
    </ThemeContext.Consumer>
)
export  default App33;

import logo from './logo.svg';
import './App.css';
import { UserComponent } from "./usercontext/UserComponent";
import { UserDsiplay } from "./usercontext/UserDisplay";
import { UserProvider } from "./usercontext/UseProvider";
import { EmployeeProvider } from "./usercontext1/EmployeeProvider";
import { EmployeeComponent1 } from "./usercontext1/EmployeeComponent1";
import { AuthProvider } from "./usercontext2/AuthProvider";
import { LoginButton } from "./usercontext2/LoginButton";
import { Articles } from './reducer/article/components/Articles';
import { AddArticle } from './reducer/article/components/AddArticle';
import { ArticleProvider } from './reducer/article/components/ArticleProvider';
import { ItemProvider } from './reducer/reducer1/ItemProvider';
import { ItemInput } from './reducer/reducer1/ItemInput';
import { ItemList } from './reducer/reducer1/ItemList';
// reducer/article\\omponents\AddArticle.js
function App() {
    return (
        <div className="container">
            <div className="row border border-primary p-5 m-5">
                <UserProvider>
                    <div className="col-6">
                        <UserComponent />
                    </div>
                    <div className="col-6">
                        <UserDsiplay />
                    </div>
                </UserProvider>
            </div>

            <div className="row border border-primary p-5 m-5">
                <EmployeeProvider>
                    <EmployeeComponent1>

                    </EmployeeComponent1>

                </EmployeeProvider>

            </div>
            <div className="row border border-primary p-5 m-5">
                <AuthProvider>
                    <LoginButton />
                </AuthProvider>

            </div>
            <h2>using reducer and context both below </h2>
            <div className="row border border-primary p-5 m-5">
                <ArticleProvider>
                    <AddArticle></AddArticle>
                    <Articles></Articles>
                </ArticleProvider>
            </div>
            <div className="row border border-primary p-5 m-5">
                <ItemProvider>
                    <div className="col-6">
                        <ItemInput></ItemInput>
                    </div>
                    <div className="col-6">
                        <ItemList></ItemList>
                    </div>

                </ItemProvider>
            </div>
        </div>
    );
}

export default App;

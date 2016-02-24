using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

using Ninject;

namespace ManicDigger
{
    /// <summary>
    /// Simple Provider for IOC Functionality. Bad Practice of couse bad nessacary for first introduction of IOC
    /// </summary>
    public static class IOCProvider
    {
        #region CONSTRUCTOR
        static IOCProvider()
        {
            IOCProvider.DefaultKernel = new StandardKernel();

            // Declare base Bindings
            IOCProvider.DefaultKernel
                .Bind<IModTypesProvider>()
                .To<SimpleModTypesProvider>()
                .WithConstructorArgument("modName", ManicDigger.Properties.Settings.Default.DevelopmentModName);

            IOCProvider.DefaultKernel
                .Bind<ServerSystemModLoader>()
                .ToSelf();
        }
        #endregion

        #region PROPERTIES
        public static IKernel DefaultKernel { get; private set; }
        #endregion
    }
}
